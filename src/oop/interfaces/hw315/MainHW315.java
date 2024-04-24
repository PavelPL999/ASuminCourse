package oop.interfaces.hw315;

import java.util.ArrayList;

public class MainHW315 {

    public static void main(String[] args) {
        Director director = new Director();
        Programmist programmist = new Programmist();
        Povar povar = new Povar();

        ArrayList<AbleToWork> listWorkers = new ArrayList<>();
        listWorkers.add(director);
        listWorkers.add(programmist);
        listWorkers.add(povar);
        for (AbleToWork able : listWorkers) {
            able.work();
        }

        ArrayList<AbleToDrive> listDrivers = new ArrayList<>();
        listDrivers.add(programmist);
        listDrivers.add(povar);
        for (AbleToDrive able : listDrivers) {
            able.drive();
        }
    }
}
