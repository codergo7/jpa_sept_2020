package be.intecbrussel.data.mappers;

import be.intecbrussel.model.Animal;

public interface AnimalMapper {
    Animal createAnimal(String name, double weight, double age);
    Animal readAnimal(long id);
    Animal updateAnimal();
    boolean decomposeAnimal();
}
