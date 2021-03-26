package be.intecbrussel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phoneNr;

    public AnimalTag(String name, String phoneNr) {
        this.name = name;
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "AnimalTag{" +
                "name='" + name + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                '}';
    }
}
