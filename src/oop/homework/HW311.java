package oop.homework;

import java.util.ArrayList;

public class HW311 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Emma");
        names.add("Olga");

        ArrayList<Integer> id = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            id.add(i);
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            result.add(id.get(i) + " - " + names.get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
