package be.intecbrussel.hospital;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String patientName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Disease> diseases = new ArrayList<>();

    public Patient(String patientName) {
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
