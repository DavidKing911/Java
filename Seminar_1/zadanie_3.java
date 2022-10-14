// Реализовать простой калькулятор
import java.util.Scanner;
public class zadanie_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_number = iScanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int second_number = iScanner.nextInt();
        iScanner.close();
        if (operation == '/' && second_number == 0) System.out.println("Друг, на 0 делить нельзя");
        else if (operation == '+') System.out.printf("%d + %d = %d", first_number, second_number, first_number + second_number);
        else if (operation == '-') System.out.printf("%d - %d = %d", first_number, second_number, first_number - second_number);
        else if (operation == '*') System.out.printf("%d * %d = %d", first_number, second_number, first_number * second_number);
        else if (operation == '/') System.out.printf("%d / %d = %d", first_number, second_number, first_number / second_number);
    }
}
