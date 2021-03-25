package be.intecbrussel.service.mappers;

import be.intecbrussel.data.dao.AnimalDAO;
import be.intecbrussel.data.dao.AnimalDAOImpl;
import be.intecbrussel.data.dao.AnimalQueryDAO;
import be.intecbrussel.data.dao.AnimalQueryDAOImpl;
import be.intecbrussel.model.Animal;

import java.util.List;

public class AnimalMapperImpl implements AnimalMapper{
    private AnimalDAO builtInDao = new AnimalDAOImpl();
    private AnimalQueryDAO queryDao = new AnimalQueryDAOImpl();

    @Override
    public Animal createAnimal(String name, double weight, double age) {
//        Animal animal = new Animal(name, weight, age);
//        dao.createAnimal(animal);
//        return animal;

        return builtInDao.createAnimal(new Animal(name, weight, age));
    }

    @Override
    public Animal createAnimal(Animal animal) {
        return builtInDao.createAnimal(animal);
    }

    @Override
    public Animal readAnimal(long id) {
        return builtInDao.readAnimal(id);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return builtInDao.updateAnimal(animal);
    }

    @Override
    public Animal renameAnimal(long id, String newName) {
        Animal animalToUpdate = builtInDao.readAnimal(id);
        animalToUpdate.setName(newName);
        return builtInDao.updateAnimal(animalToUpdate);
    }

    @Override
    public boolean decomposeAnimal(long id) {
        return builtInDao.decomposeAnimal(id);
    }

    @Override
    public boolean decomposeAnimal(Animal animal) {
        return builtInDao.decomposeAnimal(animal.getId());
    }

    @Override
    public double getAvgAge() {
        return queryDao.getAvgAge();
    }

    @Override
    public List<Animal> getAllAnimalsAboveWeight(double weight) {
        return queryDao.getAllAnimalsAboveWeight(weight);
    }

    @Override
    public double getAvgWeightFromAnimalsAboveAge(double age) {
        return queryDao.getAvgWeightFromAnimalsAboveAge(age);
    }
}
