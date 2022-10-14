// Вывести все простые числа от 1 до 1000
public class zadanie_2 {
    public static void main(String[] args) {
        System.out.printf("%d, %d, %d, %d ", 2, 3, 5, 7);
        for (int i = 8; i <= 1000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.printf(", %d", i);
            }
        }
    }
}
