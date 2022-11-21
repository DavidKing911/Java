package Seminar_6;

import java.util.*;

public class Laptop {
    String processor;
    String motherboard;
    String ram;
    String hdd;
    String videoCard;
    
    public Laptop (String processor, String motherboard, String ram, String hdd, String videoCard) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
    }

    static public void findByProcessor(Set<Laptop> laptops, String input, Map<String, Laptop> result) {
        int count = 1;
        for (Laptop laptop : laptops) {
            if (laptop.processor.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }

    public static void findByMotherboard(Set<Laptop> laptops, String input, Map<String, Laptop> result) {
        int count = 1;
        for (Laptop laptop : laptops) {
            if (laptop.motherboard.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }

    public static void findByRam(Set<Laptop> laptops, String input, Map<String, Laptop> result) {
        int count = 1;
        for (Laptop laptop : laptops) {
            if (laptop.ram.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }

    public static void findByHdd(Set<Laptop> laptops, String input, Map<String, Laptop> result) {
        Integer count = 1;
        for (Laptop laptop : laptops) {
            if (laptop.hdd.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }

    public static void findByVideoCard(Set<Laptop> laptops, String input, Map<String, Laptop> result) {
        Integer count = 1;
        for (Laptop laptop : laptops) {
            if (laptop.videoCard.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Processor: %s\nRAM: %s\nHDD: %s\nVideoCard: %s\nMorherboard: %s", processor, ram, hdd, videoCard, motherboard);
    }
}
