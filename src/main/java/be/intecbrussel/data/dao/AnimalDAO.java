package be.intecbrussel.data.dao;

import be.intecbrussel.model.Animal;

public interface AnimalDAO {

    // CRUD
    Animal createAnimal(Animal animal);
    Animal readAnimal(long id);
    Animal updateAnimal();
    boolean decomposeAnimal();

}
