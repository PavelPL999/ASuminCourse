package primitive;

public class Variable {

    public static int calculate(int x) {
        int y = x * 5;
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(Variable.calculate(100));

        int days = 10000;
        int years = days / 365;
        int months = (days - years * 365) / 30;
        days = days - years * 365 - months * 30;
        System.out.println("years = " + years + " months = " + months + " days = " + days);
    }
}
