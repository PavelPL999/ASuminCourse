package oop.inheritance;

public class Cat extends CatFamily {

    public Cat() {
        super(4, 2, false);
        setLegs(5);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
