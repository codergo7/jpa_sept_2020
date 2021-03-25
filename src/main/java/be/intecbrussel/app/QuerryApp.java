package be.intecbrussel.app;

import be.intecbrussel.model.Animal;
import be.intecbrussel.model.AnimalTag;
import be.intecbrussel.service.mappers.AnimalMapper;
import be.intecbrussel.service.mappers.AnimalMapperImpl;

import java.util.List;

public class QuerryApp {
    public static void main(String[] args) {
        AnimalMapper animalMapper = new AnimalMapperImpl();
        addAnimalsToDB(animalMapper);
        useQuerries(animalMapper);
    }

    private static void useQuerries(AnimalMapper animalMapper) {
//        System.out.println(animalMapper.getAvgAge());
//        List<Animal> animalList = animalMapper.getAllAnimalsAboveWeight(50);
//        animalList.forEach(System.out::println);

        System.out.println(animalMapper.getAvgWeightFromAnimalsAboveAge(15));
    }

    private static void addAnimalsToDB(AnimalMapper animalMapper){
        Animal animal = new Animal("Lion", 63, 15);
        AnimalTag at = new AnimalTag("Jean-Chasseur", "911");
        animal.setAnimalTag(at);

        Animal animal2 = new Animal("Panther", 85, 99);
        AnimalTag at2 = new AnimalTag("Black Panther", "11111111");
        animal2.setAnimalTag(at2);

        Animal animal3 = new Animal("Smilidon", 9999, 45);
        AnimalTag at3 = new AnimalTag("Smile is done", "98562548");
        animal3.setAnimalTag(at3);


        animalMapper.createAnimal(animal);
        animalMapper.createAnimal(animal2);
        animalMapper.createAnimal(animal3);
    }
}
