package be.intecbrussel.data.dao;

import be.intecbrussel.model.Animal;

import java.util.List;

public interface AnimalQueryDAO {
    double getAvgAge();
    List<Animal> getAllAnimalsAboveWeight(double weight);
    double getAvgWeightFromAnimalsAboveAge(double age);
}
