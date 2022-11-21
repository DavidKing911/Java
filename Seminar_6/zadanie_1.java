package Seminar_6;

import java.util.*;

public class zadanie_1 {
    public static int inputChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите по какому компоненту хотите произвести поиск:\n1 - процессор\n2 - материнская плата\n3 - оперативная память\n4 - жесткий диск\n5 - видеокарта");
        int choice = sc.nextInt();
        return choice;
    }

    public static void result(Map<String, Laptop> result){
        for (var laptop : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", laptop.getKey(), laptop.getValue().toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Laptop> result = new LinkedHashMap<>();
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop("Intel Core i5 11400", "GIGABYTE H510M S2", "8 Gb", "2 Tb", "NVIDIA GeForce RTX 3080 Ti");
        Laptop laptop2 = new Laptop("Intel Core i5-10400F LGA1200", "GIGABYTE B550 GAMING X V2", "8 Gb", "1 Tb", "NVIDIA GeForce RTX 2060SUPER");
        Laptop laptop3 = new Laptop("AMD Ryzen 5 3600 AM4", "ASUS TUF Gaming B660M-Plus WiFi D4 B660", "8 Gb", "2 Tb", "Palit NVIDIA GeForce RTX 3060Ti");
        Laptop laptop4 = new Laptop("Intel Core i7-12700F LGA1700", "MSI MEG Z590 GODLIKE", "16 Gb", "4 Tb", "MSI NVIDIA GeForce RTX 2060SUPER");
        Laptop laptop5 = new Laptop("AMD Ryzen 7 5800X AM4", "MSI MEG Z490 ACE", "16 Gb", "2 Tb", "GIGABYTE NVIDIA GeForce RTX 3050");
        Laptop laptop6 = new Laptop("Intel Core i9-11900K LGA1200", "ATX GIGABYTE Z590 D", "8 Gb", "1 Tb", "MSI NVIDIA GeForce GTX 1660SUPER");
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        filter.put(1, "processor");
        filter.put(2, "motherboard");
        filter.put(3, "ram");
        filter.put(4, "hdd");
        filter.put(5, "videoCard");
        int selection = inputChoice();
        if (filter.containsKey(selection)) {
            switch (selection) {
                case 1: {
                    System.out.printf("Введите название %s: \n", filter.get(1));
                    System.out.print("Ввод: \n");
                    String input = sc.nextLine();
                    Laptop.findByProcessor(laptops, input, result);
                    result(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s: \n", filter.get(2));
                    System.out.print("Ввод: \n");
                    String input = sc.nextLine();
                    Laptop.findByMotherboard(laptops, input, result);
                    result(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s: \n", filter.get(3));
                    System.out.print("Ввод: \n");
                    String input = sc.nextLine();
                    Laptop.findByRam(laptops, input, result);
                    result(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s: \n", filter.get(4));
                    System.out.print("Ввод: \n");
                    String input = sc.nextLine();
                    Laptop.findByHdd(laptops, input, result);
                    result(result);
                    break;
                }
                case 5: {
                    System.out.printf("Введите название %s: \n", filter.get(5));
                    System.out.print("Ввод: \n");
                    String input = sc.nextLine();
                    Laptop.findByVideoCard(laptops, input, result);
                    result(result);
                    break;
                }
                default: {
                    break;
                }
            }
        }
        sc.close();
    }
}
