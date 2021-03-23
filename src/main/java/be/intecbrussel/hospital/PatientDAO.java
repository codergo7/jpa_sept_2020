package be.intecbrussel.hospital;

import be.intecbrussel.data.EntityManagerProvider;

import javax.persistence.EntityManager;

public class PatientDAO {

    public Patient createPatient (Patient patient){
        EntityManager entityManager = EntityManagerProvider.getEM();

        entityManager.getTransaction().begin();

        patient = entityManager.merge(patient);

        entityManager.getTransaction().commit();

        entityManager.close();

        return patient;
    }

    public Disease createDisease (Disease disease){
        EntityManager entityManager = EntityManagerProvider.getEM();

        entityManager.getTransaction().begin();

        disease = entityManager.merge(disease);

        entityManager.getTransaction().commit();

        entityManager.close();

        return disease;
    }

    public void deletePatient(Patient patient) {
        EntityManager entityManager = EntityManagerProvider.getEM();

        entityManager.getTransaction().begin();

        patient = entityManager.find(Patient.class, 1L);
        entityManager.remove(patient);

        entityManager.getTransaction().commit();

        entityManager.close();

    }

}
