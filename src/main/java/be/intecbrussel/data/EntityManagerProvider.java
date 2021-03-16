package be.intecbrussel.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADEMO");

    public static EntityManager getEM() {
        return emf.createEntityManager();
    }
}
