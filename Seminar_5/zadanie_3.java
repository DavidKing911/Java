// На шахматной доске расставить 8 ферзей так, 
// чтобы они не били друг друга. И вывести Доску.

package Seminar_5;

import java.util.LinkedList;
import java.util.Random;

public class zadanie_3 {
    public static boolean check(LinkedList<Integer> arr, int num) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == num) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkAbs(LinkedList<Integer> arr_1, LinkedList<Integer> arr_2, int num_1, int num_2) {
        for (int i = 0; i < arr_1.size(); i++) {
            if (Math.abs(arr_1.get(i) - num_1) == Math.abs(arr_2.get(i) - num_2)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        int count = 0;
        while (count != 8) {
            LinkedList<Integer> ll_x = new LinkedList<Integer>();
            LinkedList<Integer> ll_y = new LinkedList<Integer>();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = 0;
                }
            }
            Random rnd = new Random();
            int x_1 = rnd.nextInt(8);
            int y_1 = rnd.nextInt(8);
            array[x_1][y_1] = 1;
            ll_x.add(x_1);
            ll_y.add(y_1);
            count = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (check(ll_x, i) && check(ll_y, j) && checkAbs(ll_x, ll_y, i, j)) {
                        array[i][j] = 1;
                        ll_x.add(i);
                        ll_y.add(j);
                        count++;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nПеред вами шахматная доска, на которой ферзи не бьют друг друга");
    }
}
