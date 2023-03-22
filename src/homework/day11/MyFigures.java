package homework.day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFigures {
    public static void main(String[] args) {
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));


        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
            for (String figure : figures) {
                out.write(figure + "-");
            }
            out.close();

        } catch (IOException e) {
            System.out.println("IOException - File not found");
        }

        int counter = 0;

        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.add(3, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
