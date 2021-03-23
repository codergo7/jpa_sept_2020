package be.intecbrussel.hospital;

import be.intecbrussel.data.EntityManagerProvider;

public class App {
    public static void main(String[] args) {
        PatientDAO dao = new PatientDAO();

        Patient p1 = new Patient("Francois Hollande");
        Patient p2 = new Patient("Jean-Michel Saive");
        Patient p3 = new Patient("Usain Bolt");
        Patient p4 = new Patient("Jean-Claude Van Damme");
        Patient p5 = new Patient("Vince McMahon");
        Patient p6 = new Patient("Shawn Michaels");
        Patient p7 = new Patient("Yoshi-p");
        Patient p8 = new Patient("Tom");
        Patient p9 = new Patient("William");
        Patient p10 = new Patient("Homer");

        Disease d1 = new Disease("Covid-21");
        Disease d2 = new Disease("Artritis");
        Disease d3 = new Disease("pneumonitis");
        Disease d4 = new Disease("Heptitis Alphabet");
        Disease d5 = new Disease("Alzheimer");
        Disease d6 = new Disease("meningitis");
        Disease d7 = new Disease("lintworm");
        Disease d8 = new Disease("EWW");
        Disease d9 = new Disease("British");
        Disease d10 = new Disease("Argentina");
        Disease d11 = new Disease("Ebola");
        Disease d12 = new Disease("Hypochondriac syndrom");

        d1 = dao.createDisease(d1);
        d2 = dao.createDisease(d2);
        d3 = dao.createDisease(d3);
        d4 = dao.createDisease(d4);
        d5 = dao.createDisease(d5);
        d6 = dao.createDisease(d6);
        d7 = dao.createDisease(d7);
        d8 = dao.createDisease(d8);
        d9 = dao.createDisease(d9);
        d10 = dao.createDisease(d10);
        d11 = dao.createDisease(d11);
        d12 = dao.createDisease(d12);


        p1.addDisease(d5);
        p1.addDisease(d9);
        p1.addDisease(d4);
        p1.addDisease(d3);

        p2.addDisease(d1);
        p2.addDisease(d2);
        p2.addDisease(d8);
        p2.addDisease(d9);

        p3.addDisease(d5);
        p3.addDisease(d6);
        p3.addDisease(d7);
        p3.addDisease(d8);

        p4.addDisease(d2);
        p4.addDisease(d12);
        p4.addDisease(d3);
        p4.addDisease(d9);

        p5.addDisease(d10);
        p5.addDisease(d4);
        p5.addDisease(d7);
        p5.addDisease(d8);

        p6.addDisease(d10);
        p6.addDisease(d12);
        p6.addDisease(d4);
        p6.addDisease(d3);

        p7.addDisease(d5);
        p7.addDisease(d10);
        p7.addDisease(d7);
        p7.addDisease(d8);

        p8.addDisease(d4);
        p8.addDisease(d9);
        p8.addDisease(d6);
        p8.addDisease(d3);

        p9.addDisease(d1);
        p9.addDisease(d2);
        p9.addDisease(d11);
        p9.addDisease(d4);

        p10.addDisease(d11);
        p10.addDisease(d9);
        p10.addDisease(d4);
        p10.addDisease(d3);

        dao.createPatient(p1);
        dao.createPatient(p2);
        dao.createPatient(p3);
        dao.createPatient(p4);
        dao.createPatient(p5);
        dao.createPatient(p6);
        dao.createPatient(p7);
        dao.createPatient(p8);
        dao.createPatient(p9);
        dao.createPatient(p10);

        Patient pp = EntityManagerProvider.getEM().find(Patient.class, 1L);

        dao.deletePatient(pp);
    }
}
