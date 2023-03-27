package homework.day13;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        figures.mapToInt(String::length).filter(x -> x > 4).forEach(System.out::println);

    }
}
