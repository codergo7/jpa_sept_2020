package be.intecbrussel.data.mappers;

import be.intecbrussel.data.dao.AnimalDAO;
import be.intecbrussel.data.dao.AnimalDAOImpl;
import be.intecbrussel.model.Animal;

public class AnimalMapperImpl implements AnimalMapper{
    private AnimalDAO dao = new AnimalDAOImpl();

    @Override
    public Animal createAnimal(String name, double weight, double age) {
//        Animal animal = new Animal(name, weight, age);
//        dao.createAnimal(animal);
//        return animal;

        return dao.createAnimal(new Animal(name, weight, age));
    }

    @Override
    public Animal readAnimal(long id) {
        return dao.readAnimal(id);
    }

    @Override
    public Animal updateAnimal() {
        return null;
    }

    @Override
    public boolean decomposeAnimal() {
        return false;
    }
}
