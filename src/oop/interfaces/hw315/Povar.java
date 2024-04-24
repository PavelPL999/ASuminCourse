package oop.interfaces.hw315;

public class Povar implements AbleToWork, AbleToDrive {

    @Override
    public void work() {
        System.out.println("Повар работает");
    }

    @Override
    public void drive() {
        System.out.println("Повар водит");
    }
}
