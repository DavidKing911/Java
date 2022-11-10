// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;

public class zadanie_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        LinkedList<Integer> new_ll = new LinkedList<Integer>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            new_ll.add(ll.get(i));
        }
        System.out.println(new_ll);
    }
}
