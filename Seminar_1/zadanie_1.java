// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class zadanie_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        int comp = 1;
        for (int i = 1; i <= number; i++) {
            comp *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d -> %d", number, sum);
        System.out.println();
        System.out.printf("Произведение чисел от 1 до %d -> %d", number, comp);
    }
}