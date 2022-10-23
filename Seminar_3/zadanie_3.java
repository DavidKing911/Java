//Задан целочисленный список ArrayList. Найти минимальное, 
//максимальное и среднее арифметическое из этого списка.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class zadanie_3 {
    static ArrayList<Integer> fill_array() {
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rnd.nextInt(0, 10));
        }
        System.out.println("Первоначальный массив -> " + array);
        return array;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = fill_array();
        System.out.println("Максимальное число из списка -> " + Collections.max(arr));
        System.out.println("Минимальное число из списка -> " + Collections.min(arr));
        System.out.println("Среднее арифметическое списка -> " + arr.stream().mapToInt(val -> val).average().orElse(0.0));
    }
}
