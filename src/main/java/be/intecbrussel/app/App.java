package be.intecbrussel.app;

import be.intecbrussel.service.mappers.AnimalMapper;
import be.intecbrussel.service.mappers.AnimalMapperImpl;

public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal("Jean-Jaque", 100, 5);
//        System.out.println(animal);

        AnimalMapper am = new AnimalMapperImpl();
//        Animal crud = am.createAnimal("Jean-Teste-deux", 20, 50);
//        System.out.println(crud);

//        Animal animal = am.readAnimal(3);
//        System.out.println(animal);
//        animal.setAge(50);
//        animal.setWeight(20);
//        animal.setName("PlizWork");
//        am.updateAnimal(animal.getId(), animal);

        am.renameAnimal(1, "Jean-Exception");

//        boolean isDeleted = am.decomposeAnimal(9);
//        System.out.println(isDeleted);
    }
}
