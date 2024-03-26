package oop.examples;

public class Monster {

    int eyes;
    int arms;
    int legs;

    Monster() {
        this(2);
    }

    Monster(int quantity) {
        this(quantity, quantity, quantity);
    }

    Monster(int eye, int arm, int leg) {
        this.eyes = eye;
        this.arms = arm;
        this.legs = leg;
    }

    void voice() {
        voice(1, "Grrrrrrr...");
    }

    void voice(int count) {
        voice(count, "Grrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
