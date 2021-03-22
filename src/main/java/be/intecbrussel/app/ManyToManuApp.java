package be.intecbrussel.app;

import be.intecbrussel.model.Animal;
import be.intecbrussel.model.AnimalTag;
import be.intecbrussel.model.Food;
import be.intecbrussel.service.mappers.AnimalMapper;
import be.intecbrussel.service.mappers.AnimalMapperImpl;

public class ManyToManuApp {
    public static void main(String[] args) {
        AnimalMapper am = new AnimalMapperImpl();
//        FoodMapper fm = new FoodMapperImpl();

        Animal animal = new Animal("Lion", 20, 20);
        AnimalTag at = new AnimalTag("Jean-Chasseur", "911");

        Animal animal2 = new Animal("Panther", 20, 20);
        AnimalTag at2 = new AnimalTag("Black Panther", "11111111");

        Food bambi = new Food();
        bambi.setName("Tasty Bambi");

        Food anthony = new Food();
        anthony.setName("Once again! Anthony");

        Food nemo = new Food();
        nemo.setName("Fishy Nemo");

        animal.setDiet(new Food[]{bambi, anthony});
        animal = am.createAnimal(animal);

        animal2.setDiet(new Food[]{nemo, animal.getDiet()[0], animal.getDiet()[1]});
        am.createAnimal(animal2);


        Animal animal3 = new Animal("Smilidon", 20, 20);
//        Food bambi = fm.readFood(1);
//        Food nemo = fm.readFood(3);
        animal3.setDiet(new Food[]{bambi, nemo});
        am.createAnimal(animal3);


    }
}
