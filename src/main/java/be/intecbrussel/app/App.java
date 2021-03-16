package be.intecbrussel.app;

import be.intecbrussel.data.dao.AnimalDAO;
import be.intecbrussel.data.dao.AnimalDAOImpl;
import be.intecbrussel.data.mappers.AnimalMapper;
import be.intecbrussel.data.mappers.AnimalMapperImpl;
import be.intecbrussel.model.Animal;

public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal("Jean-Jaque", 100, 5);
//        System.out.println(animal);

        AnimalMapper am = new AnimalMapperImpl();
//        Animal crud = am.createAnimal("Jean-CruditE", 20, 50);
//        System.out.println(crud);

        Animal animal = am.readAnimal(6);
        System.out.println(animal);
    }
}
