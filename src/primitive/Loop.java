package primitive;

public class Loop {

    public static void main(String[] args) {
        /*
        int x = 1;
        while (x <= 1000) {
            System.out.println(x);
            x++;
            if (x == 5) {
                break;
            }
        }

        int a = 0;
        do {
            System.out.println("Hello");
        } while (a > 0);


        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
        */

        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
