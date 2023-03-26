package classwork.day13;

import homework.day12.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("мама", "мыла", "раму", "мама", "чисто"));

        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split(""))).
                peek(System.out::println).max(String::compareTo).get());

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get());

        System.out.println(list.stream().map(String::length).reduce(Integer::sum).get());
    }
}
