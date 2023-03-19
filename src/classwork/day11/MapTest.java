package classwork.day11;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int key : words.keySet()) {
            System.out.println(key);
        }

        for (String value : words.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> word : words.entrySet()) {
            System.out.println(word);
        }

    }

}
