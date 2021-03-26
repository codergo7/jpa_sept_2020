package be.intecbrussel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;

@Entity(name = "Students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name= "Animal.getAvgWeightFromAnimalsAboveAge",
                query="SELECT AVG(s.weight) FROM Students s WHERE s.age > :age")
})
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    private long id;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "animal_weight")
    private double weight;

    @Column(name = "animal_age")
    private double age;

    @OneToOne (cascade = CascadeType.ALL)
    private AnimalTag animalTag;

    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @OrderColumn
    @JoinTable(name ="animal_food", joinColumns = @JoinColumn(name = "animal_id"), inverseJoinColumns = @JoinColumn(name= "food_id"))
    private Food[] diet;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private FeedingQueue feedingQueue = new FeedingQueue();

    public FeedingQueue getFeedingQueue() {
        return feedingQueue;
    }

    public void setFeedingQueue(FeedingQueue feedingQueue) {
        this.feedingQueue = feedingQueue;
    }

    public Animal(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", animalTag=" + animalTag +
                ", diet=" + Arrays.toString(diet) +
                ", feedingQueue=" + feedingQueue +
                '}';
    }

}
