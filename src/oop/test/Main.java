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
        MyArrayList emp = getEmployees();
        emp.add("James");
        emp.remove("Emma");
        for (int i = 0; i < emp.getSize(); i++) {
            System.out.println(emp.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}
