// Реализовать алгоритм сортировки слиянием
package Seminar_3;

import java.util.Arrays;

public class zadanie_1 {
    public static int[] sort(int[] arr) {
        int[] new_array_1 = Arrays.copyOf(arr, arr.length);
        int[] new_array_2 = new int[arr.length];
        int[] result = mergesort(new_array_1, new_array_2, 0, arr.length);
        return result;
    }

    public static int[] mergesort(int[] new_arr_1, int[] new_arr_2, int first_ind, int second_ind) {
        if (first_ind >= second_ind - 1) {
            return new_arr_1;
        }
        int middle = first_ind + (second_ind - first_ind) / 2;
        int[] array_1 = mergesort(new_arr_1, new_arr_2, first_ind, middle);
        int[] array_2 = mergesort(new_arr_1, new_arr_2, middle, second_ind);
        int index_1 = first_ind;
        int index_2 = middle;
        int new_index = first_ind;
        int[] result = array_1 == new_arr_1 ? new_arr_2 : new_arr_1;
        while (index_1 < middle && index_2 < second_ind) {
            if (array_1[index_1] < array_2[index_2]) {
                result[new_index++] = array_1[index_1++];
            }
            else result[new_index++] = array_2[index_2++];
        }
        while (index_1 < middle) {
            result[new_index++] = array_1[index_1++];
        }
        while (index_2 < second_ind) {
            result[new_index++] = array_2[index_2++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 1, 7, 8, 1, 2, 4};
        int[] result = sort(array);
        System.out.println(Arrays.toString(result));
    }
}
