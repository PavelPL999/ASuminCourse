package oop.homework;

import java.util.Random;

public class HW42 {

    public static void main(String[] args) {
        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            int num = random.nextInt(1, 7);
//            System.out.printf("Your number is %s", num + " ");
//        }

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(1, 7);
            String result = String.format("Your number is %s", num);
            System.out.println(result);
        }
    }
}
