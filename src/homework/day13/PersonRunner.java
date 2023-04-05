package homework.day13;

import homework.day11.objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        Stream<Person> people = Stream.of(new Person(32, "Коля"), new Person(24, "Оля"),
                new Person(55, "Вася"), new Person(63, "Маша"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("middle_age.txt"))) {
            writer.write(String.valueOf(people.filter(x -> x.getAge() < 60)
                    .sorted((Comparator.comparing(Person::getName)))
                    .map(x -> new Person(x.getAge() + 4, x.getName()))
                    .mapToInt(Person::getAge).average()));
        } catch (IOException ex) {
            System.out.println("IOException - writing error");
        }
    }
}

