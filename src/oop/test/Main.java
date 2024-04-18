package oop.test;

import oop.box.Box;
import oop.box.WeightBox;
import oop.inheritance.Rectangle;
import oop.inheritance.Triangle;
import oop.inheritance.TriangleRed;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Triangle triangle = new Triangle(5, 5 , 8);
        TriangleRed trRed = new TriangleRed(5,5,8);
        rect.showPerimeter();
        triangle.showPerimeter();
        trRed.showPerimeter();
    }
}