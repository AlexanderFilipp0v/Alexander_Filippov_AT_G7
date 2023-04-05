package homework.day13;


import homework.day11.objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) {
        List<Sand> sands = Arrays.asList(new Sand(12, "Речной"), new Sand(8, "Речной"),
                new Sand(15, "Карьерный"), new Sand(7, "Карьерный"),
                new Sand(11, "Речной"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("map.txt"))) {
            for (Map.Entry<Integer, String> item : sands.stream().filter(x -> x.getWeight() > 9 && x.getName().contains("ч")).sorted(Comparator.comparing(Sand::getWeight)).map(x -> {
                return new Sand(x.getWeight() * 2, x.getName().toUpperCase());
            }).collect(Collectors.toMap(Sand::getWeight, Sand::getName)).entrySet()) {
                writer.write(item.getValue() + ":" + item.getKey() + "\n");
            }
        } catch (IOException e) {
            System.out.println("IOException - writing error");
        }
    }
}

