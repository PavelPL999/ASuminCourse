package oop.interfaces.hw315;

public class Programmist extends Worker implements AbleToWork, AbleToDrive {

    @Override
    public void work() {
        System.out.println("Программист работает");
    }

    @Override
    public void drive() {
        System.out.println("Программист водит");
    }
}
