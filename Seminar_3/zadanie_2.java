//Пусть дан произвольный список целых чисел, удалить из него четные числа
package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class zadanie_2 {
    static ArrayList<Integer> fill_array() {
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rnd.nextInt(0, 101));
        }
        System.out.println("Первоначальный массив -> " + array);
        return array;
    }
    static void find_remove(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i -= 1;
            }
        }
        System.out.println("Массив без чётных чисел -> " + arr);
    }
    public static void main(String[] args) {
        find_remove(fill_array());
    }
}
