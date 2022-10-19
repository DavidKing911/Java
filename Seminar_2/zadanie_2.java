// Дана json строка (сохранить в файл и читать из файла) [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package Seminar_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class zadanie_2 {
    
    static void write(String[] ar) {
        /*
         * Записывает в файл массив строк
         */
        try (FileWriter fw = new FileWriter("Seminar_2/zadanie_2_base.txt", true)) {
            for (int i = 0; i < ar.length; i++) {
                fw.append(ar[i] + "\n");
            }
            fw.flush();
            fw.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    static String[] read() {
        /*
         * Читает файл и возвращает массив
         */
        int count = 0;
        String line = "";
        try {
            File file = new File("Seminar_2/zadanie_2_base.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            while ((line = read.readLine()) != null) {
                count++;
            }
            read.close();
            BufferedReader read_1 = new BufferedReader(new FileReader(file));
            String[] new_arr = new String[count];
            int i = 0;
            while ((line = read_1.readLine()) != null) {
                new_arr[i] = line;
                i++;
            }
            read_1.close();
            return new_arr;
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        String[] array = new String[] {"фамилия: Иванов, оценка: 5, предмет: Математика", 
        "фамилия: Петрова, оценка: 4, предмет: Информатика",
        "фамилия: Краснов, оценка: 5, предмет: Физика"};
        write(array);
        array = read();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Студент %s получил %s по предмету %s.", 
            array[i].split(" ")[1].substring(0, array[i].split(" ")[1].lastIndexOf(',')),
            array[i].split(" ")[3].charAt(0),
            array[i].split(" ")[5]);
            System.out.println();
        }
    }
}