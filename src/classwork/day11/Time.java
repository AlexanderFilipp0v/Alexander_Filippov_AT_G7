package classwork.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Time {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> muList2 = new LinkedList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("check");
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);


        t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            muList2.add("check");
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

    }
}
