package primitive;

public class WhatToDo {

    public static void main(String[] args) {
        int time = 23;
        boolean isDay = time > 6 && time < 22;
        boolean isWeatherGood = true;

        if (isDay && isWeatherGood) {
            System.out.println("Go for a walk!");
        }
        if (isDay && !isWeatherGood) {
            System.out.println("Read a book!");
        }
        if (!isDay) {
            System.out.println("Sleep!");
        }
    }
}
