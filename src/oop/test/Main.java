package oop.test;

import oop.examples.Person;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John", 17);
        System.out.println(person); // здесь метод toString() вызывается не явно
        System.out.println(person.toString()); // тут явно вызываем метод toString()

        Random random = new Random(); // Random - спец.класс для генерирования случайных чисел
        int number = random.nextInt(5, 11);
        System.out.println(number);
    }
}