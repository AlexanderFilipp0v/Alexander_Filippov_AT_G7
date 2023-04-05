package homework.day13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        String[] words = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        numbersMod.filter(x -> Integer.toString(x).contains("3")).
                flatMap(x -> Arrays.stream(Integer.toString(x).split(""))).
                map(x -> words[Integer.parseInt(x)]).
                distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }


}
