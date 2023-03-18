package classwork.day11;

import java.util.*;

public class TimeS {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("check" + i);
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);


        t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("check" + i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

    }
}

