package oop.examples;

public class Monster {

    int eyes;
    int arms;
    int legs;

    public Monster() {
        this(2);
    }

    public Monster(int quantity) {
        this(quantity, quantity, quantity);
    }

    public Monster(int eye, int arm, int leg) {
        this.eyes = eye;
        this.arms = arm;
        this.legs = leg;
    }

    public void voice() {
        voice(1);
    }

    public void voice(int count) {
        voice(count, "Grrrrrrr...");
    }

    public void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
