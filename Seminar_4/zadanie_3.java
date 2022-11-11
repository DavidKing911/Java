import java.util.Scanner;

public class zadanie_3 {

    static int calc(int first_num, char oper, int second_num) {
        if (oper == '/' && second_num == 0) {
            System.out.println("Друг, на 0 делить нельзя");
            return 0;
        }
        else if (oper == '+') {
            System.out.printf("%d + %d = %d", first_num, second_num, first_num + second_num);
            return first_num + second_num;
        }
        else if (oper == '-') {
            System.out.printf("%d - %d = %d", first_num, second_num, first_num - second_num);
            return first_num - second_num;
        }
        else if (oper == '*') {
            System.out.printf("%d * %d = %d", first_num, second_num, first_num * second_num);
            return first_num * second_num;
        }
        else if (oper == '/') {
            System.out.printf("%d / %d = %d", first_num, second_num, first_num / second_num);   
            return first_num / second_num;
        }
        return 0;
    }
    static int input_calc(int first_number) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int second_number = iScanner.nextInt();
        int result = calc(first_number, operation, second_number);
        return result;
    }
    static void choice_operation(int first_number, int result) {
        cycle: while (true) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("\nВыберите какую операцию хотите совершить:\n1 - продолжить\n2 - отменить предыдущее действие\n3 - выход");
            String choice = iScanner.nextLine();
            switch(choice) {
                case("1"):
                    first_number = result;
                    System.out.println(first_number);
                    result = input_calc(first_number);
                    break;
                case("2"):
                    System.out.println("Операция отменена");
                    System.out.print(first_number);
                    result = first_number;
                    break;
                case("3"):
                    break cycle;
            }
        }
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = iScanner.nextInt();
        int res = input_calc(first_num);
        choice_operation(first_num, res);
        iScanner.close();
    }
}
