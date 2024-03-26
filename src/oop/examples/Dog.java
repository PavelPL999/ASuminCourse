package oop.examples;

public class Dog {

    String name;
    String breed;
    double weight;

    int speed;

    void infoDog() {
        System.out.println("Name " + name + " Poroda " + breed + " Weight " + weight);
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Run");
        }
    }
}
