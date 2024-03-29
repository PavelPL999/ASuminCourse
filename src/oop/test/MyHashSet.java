package oop.test;

import java.util.ArrayList;
import java.util.HashSet;

public class MyHashSet {

    private static HashSet<String> getEmployees() {
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

    public static void main(String[] args) {
        HashSet<String> names = getEmployees();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
