package primitive;

public class ConditionalOperator {

    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp > 25;
        boolean cold = temp < 22;

        int time = 23;
        boolean isNight = time > 22 || time < 6;

        if (hot && !isNight) {
            System.out.println("Кондиционер включен");
        } else if (cold) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Pause");
        }

        int money = 8;
        if (money > 10) {
            System.out.println("Pizza");
        } else if (money > 6) {
            System.out.println("Burger");
        } else {
            System.out.println("Sandwich");
        }
    }
}
