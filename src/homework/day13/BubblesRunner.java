package homework.day13;

import homework.day11.objects.Bubble;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubblesRunner {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        System.out.println(bubbles.stream().filter(x -> x.getVolume() > 3).sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
                .map(x -> {
                    return new Bubble(x.getVolume() * 3, x.getName());
                }).mapToInt(Bubble::getVolume).sum());
    }
}

