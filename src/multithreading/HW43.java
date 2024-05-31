package multithreading;

import java.util.*;

/*
Написать игру "Угадай число"
Угадывать число будет какой-то поток
TODO:
- в методе main сгенерировать случайное число от 0 до 1 млрд
- создать поток, который будет угадывать это число
- поток не перебирает все числа от 0, а также генерирует случайные числа
- генерирует случайное число и проверяет - угадал или нет
- если не угадал, то генерирует следующее случайное число
- также создать поток, который будет таймером (указывать секунды процеса угадывания числа)
-
 */
public class HW43 {

    static boolean winner = false;
    public static void main(String[] args) {

        int bound = 1_000_000_000;
        Random random = new Random();
        int number = random.nextInt(bound);
        Thread threadNumber = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = random.nextInt(bound);
                } while (option != number);
                winner = true;
                System.out.println("Winner: " + option);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        threadNumber.start();

        Thread threadTimer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000_000; i++) {
                    if(winner) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        });
        threadTimer.start();
    }
}
