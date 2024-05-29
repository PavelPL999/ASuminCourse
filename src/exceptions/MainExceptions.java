package exceptions;

public class MainExceptions {

    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("qwerty");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (Exception e) {
            System.out.println("Поймано исключение: " + e.getClass() + " ---> " + e.getMessage());
        }
//        catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя!");
//        } catch (NumberFormatException e) {
//            System.out.println("Парсить надо числа");
//        }

        System.out.println("Hello, математик");
    }
}
