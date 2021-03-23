package be.intecbrussel.hospital;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String patientName;

    public Patient() {
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Disease> diseases = new ArrayList<>();

    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void addDisease(Disease disease){
        this.diseases.add(disease);
        disease.addPatient(this);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
