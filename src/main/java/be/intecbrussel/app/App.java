package be.intecbrussel.app;

import be.intecbrussel.model.Animal;
import be.intecbrussel.model.AnimalTag;
import be.intecbrussel.service.mappers.AnimalMapper;
import be.intecbrussel.service.mappers.AnimalMapperImpl;

public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal("Jean-Jaque", 100, 5);
//        animal.setAnimalTag(new AnimalTag("Django", "0413371337"));
//        System.out.println(animal);

        AnimalMapper am = new AnimalMapperImpl();
//        am.createAnimal(animal);

//        Animal crud = am.createAnimal("Jean-Teste-deux", 20, 50);
//        System.out.println(crud);

//        Animal animal = am.readAnimal(3);
//        System.out.println(animal);

//        animal.setName("Jean-Django");
//        animal.getAnimalTag().setName("Good boi Django");
//        am.updateAnimal(animal);

//        am.renameAnimal(1, "Jean-Exception");

//        boolean isDeleted = am.decomposeAnimal(4);
//        System.out.println(isDeleted);
    }
}
