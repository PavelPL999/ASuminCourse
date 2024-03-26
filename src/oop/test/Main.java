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
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}
