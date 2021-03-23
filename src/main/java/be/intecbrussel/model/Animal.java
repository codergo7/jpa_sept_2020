package be.intecbrussel.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity(name = "Students")
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

    public Animal(){}

    public Animal(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public AnimalTag getAnimalTag() {
        return animalTag;
    }

    public void setAnimalTag(AnimalTag animalTag) {
        this.animalTag = animalTag;
    }

    public Food[] getDiet() {
        return diet;
    }

    public void setDiet(Food[] diet) {
        this.diet = diet;
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

    public BrandFood goEat() {
        return feedingQueue.getFood();
    }
}
