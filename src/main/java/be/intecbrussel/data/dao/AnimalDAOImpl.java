package be.intecbrussel.data.dao;

import be.intecbrussel.data.EntityManagerProvider;
import be.intecbrussel.model.Animal;

import javax.persistence.EntityManager;

public class AnimalDAOImpl implements AnimalDAO{

    private static EntityManager entityManager = EntityManagerProvider.getEM();

    @Override
    public Animal createAnimal(Animal animal) {
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        animal = em.merge(animal);
        em.getTransaction().commit();

        em.close();
        return animal;
    }

    @Override
    public Animal readAnimal(long id) {
//        EntityManager entityManager = EntityManagerProvider.getEM();

        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);
        entityManager.getTransaction().commit();

//        entityManager.close();
        return animal;
    }

    @Override
    public Animal updateAnimal(Animal animal) {

        if (animal == null){
            return null;
        }

        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        animal = em.merge(animal);
        em.getTransaction().commit();

        em.close();
        return animal;


//        EntityManager em = EntityManagerProvider.getEM();
//        em.getTransaction().begin();
//
//        Animal current = em.find(Animal.class, id);
//        if(current == null){
//            em.getTransaction().rollback();
//            em.close();
//            return null;
//        }
//
//        current.setAge(animal.getAge());
//        current.setName(animal.getName());
//        current.setWeight(animal.getWeight());
//
//        em.getTransaction().commit();
//        em.close();
//        return animal;
    }

    @Override
    public boolean decomposeAnimal(long id) {
        EntityManager entityManager = EntityManagerProvider.getEM();
        boolean isDeleted;

        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);

        if (animal == null) {
            entityManager.getTransaction().rollback();
            entityManager.close();

            isDeleted = false;
            return isDeleted;
        }

        entityManager.remove(animal);
        entityManager.getTransaction().commit();
        entityManager.close();

        isDeleted = true;
        return isDeleted;

    }
}




































