package primitive;

public class IntegerTypes {

    public static void main(String[] args) {
        int speed = 300_000;
        long distance = (long) 365 * 24 * 60 * 60 * speed;
        System.out.println(distance);

        int a = 5;
        a++; // a += 1;
        a += 10;
        System.out.println(a);

        byte b = 127;
        // b = b + 1; // error, т.к. 1 по умолчанию тип данных int
        b++; // происходит переполнение диапазона
        System.out.println(b);

        int x = 10;
        byte y = (byte) x;
    }
}
