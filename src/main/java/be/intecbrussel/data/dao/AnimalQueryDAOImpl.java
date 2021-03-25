package be.intecbrussel.data.dao;

import be.intecbrussel.data.EntityManagerProvider;
import be.intecbrussel.model.Animal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AnimalQueryDAOImpl implements AnimalQueryDAO{
    @Override
    public double getAvgAge() {
        String query = "SELECT AVG(s.age) FROM Students s";
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        TypedQuery<Double> typedQuery = em.createQuery(query, Double.class);
        double queryResult = typedQuery.getSingleResult();
        em.getTransaction().commit();

        em.close();
        return queryResult;

    }

    @Override
    public List<Animal> getAllAnimalsAboveWeight(double weight) {
        String query = "SELECT s FROM Students s WHERE s.weight > :animalWeight";
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        TypedQuery<Animal> typedQuery = em.createQuery(query, Animal.class);
        typedQuery.setParameter("animalWeight", weight);
        List<Animal> animalList = typedQuery.getResultList();
        em.getTransaction().commit();

        em.close();
        return animalList;
    }

    @Override
    public double getAvgWeightFromAnimalsAboveAge(double age) {
        EntityManager em = EntityManagerProvider.getEM();

        em.getTransaction().begin();
        TypedQuery<Double> typedQuery = em.createNamedQuery("Animal.getAvgWeightFromAnimalsAboveAge", Double.class);
        typedQuery.setParameter("age", age);
        double queryResult = typedQuery.getSingleResult();
        em.getTransaction().commit();

        em.close();
        return queryResult;
    }
}
