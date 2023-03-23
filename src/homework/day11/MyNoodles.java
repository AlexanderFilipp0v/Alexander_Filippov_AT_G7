package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        StringBuilder noodleString = new StringBuilder();
        for (String noodle : noodles) {
            noodleString.append(noodle).append(" - ");
        }
        String noodlesNew = noodleString.toString();
        if (noodlesNew.length() > 1) {
            noodlesNew = noodlesNew.substring(0, noodlesNew.length() - 2);
        }
        System.out.println(noodlesNew);

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace('a', 'o'));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
