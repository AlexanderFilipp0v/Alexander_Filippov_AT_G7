package homework.day11;

import homework.day11.objects.Water;

import java.util.Arrays;
import java.util.List;

public class MyWater {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачная"));

        for (Water water1 : water) {
            System.out.println(water1.getColor() + " - " + water1.getSmell());
        }
    }
}
