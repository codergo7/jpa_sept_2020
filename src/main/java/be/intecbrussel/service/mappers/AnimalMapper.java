package be.intecbrussel.service.mappers;

import be.intecbrussel.model.Animal;

public interface AnimalMapper {
    Animal createAnimal(String name, double weight, double age);

    Animal readAnimal(long id);

    Animal updateAnimal(Animal animal);
    Animal renameAnimal(long id, String newName);

    boolean decomposeAnimal(long id);
    boolean decomposeAnimal(Animal animal);
}
