// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).
package Seminar_2;

import java.util.Scanner;

public class zadanie_3 {
    static boolean palindrom(String text) {
        String reverse = new StringBuffer(text).reverse().toString();
        return text.equalsIgnoreCase(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(palindrom(str));
    }
}