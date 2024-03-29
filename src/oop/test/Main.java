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
        String s1 = "1000";
        String s2 = "2000";
        System.out.println(s1 + s2);
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        String s = "He is John. He is 27 years old.";

        Person person = new Person(s.substring(6, 10), Integer.parseInt(s.substring(18, 20)));
        System.out.println(person.getName() + " " + person.getAge());
    }
}
