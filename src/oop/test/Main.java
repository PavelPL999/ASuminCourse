package oop.test;

import oop.box.*;
import oop.examples.*;
import oop.inheritance.Cat;
import oop.inheritance.Lion;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> emp = getEmployees();
        emp.add("James");
        emp.remove("Emma");
        emp.remove(1);
        for (String e : emp) {
            System.out.println(e);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}
