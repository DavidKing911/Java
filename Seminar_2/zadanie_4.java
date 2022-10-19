// К калькулятору из предыдущего дз добавить логирование.
package Seminar_2;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class zadanie_4 {

    static void calc(int first_num, char oper, int second_num) {
        if (oper == '/' && second_num == 0) {
            System.out.println("Друг, на 0 делить нельзя");
            logger.log(Level.INFO, "Пользователь делит число на ноль");
        }
        else if (oper == '+') {
            System.out.printf("%d + %d = %d", first_num, second_num, first_num + second_num);
            logger.log(Level.INFO, "Результат вычисления -> " + (first_num + second_num));
        }
        else if (oper == '-') {
            System.out.printf("%d - %d = %d", first_num, second_num, first_num - second_num);
            logger.log(Level.INFO, "Результат вычисления -> " + (first_num - second_num));
        }
        else if (oper == '*') {
            System.out.printf("%d * %d = %d", first_num, second_num, first_num * second_num);
            logger.log(Level.INFO, "Результат вычисления -> " + (first_num * second_num));
        }
        else if (oper == '/') {
            System.out.printf("%d / %d = %d", first_num, second_num, first_num / second_num);
            logger.log(Level.INFO, "Результат вычисления -> " + (first_num / second_num));       
        }
    }
    
    static Logger logger = Logger.getLogger(zadanie_4.class.getName());
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_number = iScanner.nextInt();
        logger.log(Level.INFO, "Ввод первого числа: " + first_number);
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        logger.log(Level.INFO, "Выбор операции: " + operation);
        System.out.print("Введите второе число: ");
        int second_number = iScanner.nextInt();
        logger.log(Level.INFO, "Ввод второго числа: " + second_number);
        iScanner.close();
        calc(first_number, operation, second_number);
    }
}