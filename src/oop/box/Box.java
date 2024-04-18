package oop.box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box anotherBox) {
        this(anotherBox.length, anotherBox.width, anotherBox.height);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box() {
        this(10);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int compare(Box another) {
        double currentVolume = getVolume(); //получили объем текущей коробки
        double anotherVolume = another.getVolume(); // объем коробки another

        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box copy() {
         return new Box(this.length, this.width, this.height);
     }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
     }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }
}
