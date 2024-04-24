package oop.interfaces;

import java.util.ArrayList;

public class MainInterfaces {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//
//        for (Animal animal: animals) {
//            animal.eat();
//        }
//        Animal animal = new Dog(); // Dog IS-A Animal (upcast)
//        animal.eat();
//        ((Dog)(animal)).run(); // в родительском классе Animal нет метода run(), кастим переменную animal к типу Dog (downcast, делаем вручную)

        ArrayList<AbleToRun> animalsRun = new ArrayList<>();
        animalsRun.add(cat);
        animalsRun.add(dog);
        animalsRun.add(bird);
        for (AbleToRun a : animalsRun) {
            a.run();
        }

        AbleToFly ableToFly = new Bird();
        ableToFly.fly();
        ((Bird)(ableToFly)).eat();
    }
}
