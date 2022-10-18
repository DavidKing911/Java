// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
package Seminar_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class zadanie_1 {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            write(i, arr);            
        }
    }
    static void write(int k, int[] ar) {
        try (FileWriter fw = new FileWriter("Seminar_2/zadanie_1_log.txt", true)) {
            if (k == ar.length) {
                fw.append("Неотсортированный массив - " + Arrays.toString(ar) + "\n");
            } else if (k == ar.length - 2) {
                fw.append(k+1 + " итерация - " + Arrays.toString(ar) + "\n\n");
            } else {
                fw.append(k+1 + " итерация - " + Arrays.toString(ar) + "\n");
            }
            fw.flush();
            fw.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 7, 2, 1, 8, -9, 4, 1, 0};
        write(array.length, array);
        sort(array);
    }
}
