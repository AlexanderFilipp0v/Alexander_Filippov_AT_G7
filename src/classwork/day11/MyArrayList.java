package classwork.day11;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String[] array = "Мама мыла раму".split(" ");

        for (String s : array) {
            myList.add(s);
        }

        for (String s : myList) {
            System.out.println(s);

        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }

    }


}
