package homework.day11;

import homework.day11.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySand {
    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> myMap = new HashMap<>();
        for (int i = 0; i < sands.size(); i++) {
            myMap.put(i, sands.get(i));
        }

        for (int key : myMap.keySet()) {
            System.out.println(key);
        }

        for (Sand value : myMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Sand> key : myMap.entrySet()) {
            System.out.println(key);
        }
    }
}
