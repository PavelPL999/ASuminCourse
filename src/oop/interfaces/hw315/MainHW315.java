package oop.interfaces.hw315;

import java.util.ArrayList;

public class MainHW315 {

    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Programmist programmist = new Programmist();

        director.force(worker);
        director.force(programmist);
    }
}
