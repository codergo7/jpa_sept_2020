package be.intecbrussel.service.mappers;

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
    public Animal createAnimal(Animal animal) {
        return dao.createAnimal(animal);
    }

    @Override
    public Animal readAnimal(long id) {
        return dao.readAnimal(id);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return dao.updateAnimal(animal);
    }

    @Override
    public Animal renameAnimal(long id, String newName) {
        Animal animalToUpdate = dao.readAnimal(id);
        animalToUpdate.setName(newName);
        return dao.updateAnimal(animalToUpdate);
    }

    @Override
    public boolean decomposeAnimal(long id) {
        return dao.decomposeAnimal(id);
    }

    @Override
    public boolean decomposeAnimal(Animal animal) {
        return dao.decomposeAnimal(animal.getId());
    }
}
