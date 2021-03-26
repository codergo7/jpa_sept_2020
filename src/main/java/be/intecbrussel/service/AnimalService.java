package be.intecbrussel.service;

import be.intecbrussel.model.Animal;

import java.util.List;

public interface AnimalService {
    // Built-in methods
    Animal createAnimal(String name, double weight, double age);
    Animal createAnimal(Animal animal);

    Animal readAnimal(long id);

    Animal updateAnimal(Animal animal);
    Animal renameAnimal(long id, String newName);

    boolean decomposeAnimal(long id);
    boolean decomposeAnimal(Animal animal);

    // Querry Methods

    double getAvgAge();
    List<Animal> getAllAnimalsAboveWeight(double weight);
    double getAvgWeightFromAnimalsAboveAge(double age);
}
