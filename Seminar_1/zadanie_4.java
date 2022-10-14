// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут 
// быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
public class zadanie_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String first_number = iScanner.nextLine();
        System.out.print("Введите второе число: ");
        String second_number = iScanner.nextLine();
        System.out.print("Введите результат: ");
        int result = iScanner.nextInt();
        iScanner.close();
        if (first_number.charAt(0) == '?') {
            if (second_number.charAt(0) == '?') {
                calc(first_number, second_number, result, 1, 1);
            }
            else {
                calc(first_number, second_number, result, 1, 0);
            }   
        }
        else {
            if (second_number.charAt(0) == '?'){
                calc(first_number, second_number, result, 0, 1);
            }
            else {
                calc(first_number, second_number, result, 0, 0);
            }
        }
    }
    static void calc(String first_num, String second_num, int res, int ind_1, int ind_2) {
        /*
            * Перебирает числа заместо знака вопроса и ищет все подходищие варианты
        */
        String first_num_1 = "";
        String second_num_1 = "";
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (ind_1 == 1) {
                first_num_1 = Integer.toString(i) + first_num.charAt(ind_1);
            }
            if (ind_1 == 0){
                first_num_1 = first_num.charAt(ind_1) + Integer.toString(i);
            }
            for (int j = 0; j < 10; j++) {
                if (ind_2 == 1){
                    second_num_1 = Integer.toString(j) + second_num.charAt(ind_2);
                }
                if (ind_2 == 0){
                    second_num_1 = second_num.charAt(ind_2) + Integer.toString(j);
                }
                int res_1 = Integer.parseInt(first_num_1) + Integer.parseInt(second_num_1);
                if (res_1 == res) {
                    System.out.printf("%s + %s = %d", first_num_1, second_num_1, res_1);
                    System.out.println();
                }
                if (res_1 != res) {
                    count ++;
                }
            }
        }
        if (count == 100) System.out.print("Решений нет");
    }
}