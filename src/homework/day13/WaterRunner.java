package homework.day13;

import homework.day11.objects.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<Water> water = Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачная"), new Water("Синяя", "Мятный"));

        System.out.println(water.filter(x -> !x.getColor().equals("Прозрачная"))
                .sorted((x1, x2) -> -x1.getSmell().compareTo(x2.getSmell()))
                .map(x -> new Water(x.getColor(), x.getSmell().replace("ы", "ыы")))
                .map(Water::getSmell)
                .collect(Collectors.joining()).length());
    }
}
