package homework.day13;

import homework.day11.objects.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        Random random = new Random();
        System.out.println(doubles.map(x -> (int) Math.round(x)).map(random::nextInt).distinct().map(x -> {
            List<Bubble> bubblesList = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                bubblesList.add(new Bubble(x, "Bubble vol-" + x));
            }
            return bubblesList.stream();
        }).mapToInt(d -> d.peek(System.out::println).mapToInt(Bubble::getVolume).sum()).sum());
    }
}

