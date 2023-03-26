package classwork.day13;

import homework.day12.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewNewCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("мама", "мыла", "раму", "мама", "чисто"));

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().
                collect(Collectors.toList()));

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(people.stream().sorted((p1, p2) -> {
            if (p1.getSex() != p2.getSex()) {
                return p1.getSex().compareTo(p2.getSex());
            } else return p1.getAge() - p2.getAge();
        }).peek(System.out::println).collect(Collectors.toList()));

    }
}
