package exceptions.homeworks;

public class HW41 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getClass());
        } finally {
            System.out.println("This is a finally block, bro!");
        }
        System.out.println("Homework Lesson 4.1 forever!");
    }
}
