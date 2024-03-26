package primitive;

public class ForEach {

    public static void main(String[] args) {
        String[] names = {
                "Petr",
                "Irina",
                "Adela",
                "Kir"
        };

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 + i;
            System.out.println(numbers[i]);
        }

    }
}
