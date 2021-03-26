package be.intecbrussel.app;

import be.intecbrussel.model.Animal;
import be.intecbrussel.model.BrandFood;
import be.intecbrussel.model.FeedingQueue;
import be.intecbrussel.service.AnimalService;
import be.intecbrussel.service.AnimalServiceImpl;

public class ManyApp {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalServiceImpl();

        Animal animal = new Animal("Vito", 3, 40);
        Animal animal2 = new Animal("Nero", 3, 30);
        Animal animal3 = new Animal("Smilidon", 70, 800);

        FeedingQueue queueLU = new FeedingQueue();
        BrandFood centwafels = new BrandFood();
        centwafels.setName("Centwafels");
        centwafels.setBrand("LU");

        BrandFood petitBeurre = new BrandFood();
        petitBeurre.setName("petit beurkes");
        petitBeurre.setBrand("LU");

        BrandFood prinsenkoeken = new BrandFood();
        prinsenkoeken.setName("prinsenKoeken");
        prinsenkoeken.setBrand("LU");

        queueLU.setName(centwafels);

        queueLU.addFood(centwafels);
        queueLU.addFood(petitBeurre);
        queueLU.addFood(prinsenkoeken);

        animal.setFeedingQueue(queueLU);
        animal = animalService.createAnimal(animal);

        queueLU = animal.getFeedingQueue();

        animal2.setFeedingQueue(queueLU);
        animal2 = animalService.createAnimal(animal2);
        animal3.setFeedingQueue(queueLU);
        animal3 = animalService.createAnimal(animal3);

//        System.out.println(animal);
//        System.out.println(animal2);
//        System.out.println(animal3);
//
//        System.out.println(animal.goEat());
//        System.out.println(animal2.goEat());
//        System.out.println(animal3.goEat());

//        Animal animalDB = animalMapper.readAnimal(3L);
//        System.out.println(animalDB);
//        animalDB = animalMapper.readAnimal(2L);
//        System.out.println(animalDB);

//        Animal animalToUpdate = animalMapper.readAnimal(3);
//        animalToUpdate.setName("Smile is done");
//        BrandFood bf = new BrandFood();
//        bf.setBrand("LU");
//        bf.setName("Die kleine beertjes");
//        animalToUpdate.getFeedingQueue().addFood(bf);
//
//        animalMapper.updateAnimal(animalToUpdate);


         animalService.decomposeAnimal(2L);

         Animal an = animalService.readAnimal(1);
         System.out.println(an);
    }
}
