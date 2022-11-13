// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с 
// количеством повторений. Отсортировать по убыванию популярности Имени.

package Seminar_5;

import java.util.*;

public class zadanie_2 {
    public static void sortedName(String[] arr) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].split(" ")[0].equals(arr[j].split(" ")[0])) {
                    count++;
                }
            }
            map.putIfAbsent(arr[i].split(" ")[0], count);
            count = 0;
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
    public static void main(String[] args) {
        String[] array = new String[] {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
        "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
        "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        sortedName(array);
    }
}
