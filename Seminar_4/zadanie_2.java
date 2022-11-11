// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class zadanie_2 {
    public static void enqueue(LinkedList<Integer> list, int elem) {
        list.addLast(elem);
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void basic(LinkedList<Integer> list) {
        basic: while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите какую операцию хотите совершить:\n1 - добавление числа в конец очереди\n2 - получение первого элемента из очереди и его удаление\n3 - отображение первого элемента\n4 - выход");
            String data = sc.nextLine();
            switch(data) {
                case("1"):
                    System.out.print("Введите число, которое хотите добавить в очередь: ");
                    int number = sc.nextInt();
                    enqueue(list, number);
                    System.out.println("Ваша очередь: " + list);
                    break;
                case("2"):
                    System.out.printf("Элемент %d, который был удалён из очереди", dequeue(list));
                    System.out.println("\nВаша очередь: " + list);
                    break;
                case("3"):
                    System.out.printf("Первый элемент из очереди: %d", first(list));
                    System.out.println("\nВаша очередь: " + list);
                    break;
                case("4"):
                    break basic;
            }
        }      
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        basic(ll);
    }
}
