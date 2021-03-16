package be.intecbrussel.data.dao;

import be.intecbrussel.data.EntityManagerProvider;
import be.intecbrussel.model.Animal;

import javax.persistence.EntityManager;

public class AnimalDAOImpl implements AnimalDAO{
    @Override
    public Animal createAnimal(Animal animal) {
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        em.persist(animal);
        em.getTransaction().commit();

        em.close();
        return animal;
    }

    @Override
    public Animal readAnimal(long id) {
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();

        em.close();
        return animal;
    }

    @Override
    public Animal updateAnimal() {
        return null;
    }

    @Override
    public boolean decomposeAnimal() {
        return false;
    }
}
