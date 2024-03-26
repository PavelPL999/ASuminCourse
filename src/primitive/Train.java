package primitive;

import java.util.Arrays;

public class Train {

    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'f', 'g'};
        String str = "abcdefg";

        // Сравнение элементов массива и букв строки
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == str.charAt(i)) {
                System.out.println("Элемент массива " + arr[i] + " равен букве " + str.charAt(i));
            }
        }

        // Сортировка массива
        Arrays.sort(arr);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
