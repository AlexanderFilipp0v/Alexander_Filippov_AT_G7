package homework.day12;

import java.util.Arrays;
import java.util.List;

public class MyPeople {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person person : people) {
            if (person.age >= 18 && ((person.age < 60 && person.sex == Person.Sex.MAN)
                    || (person.age < 55 && person.sex == Person.Sex.WOMAN))) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(people.stream().filter(person -> person.age >= 18 && person.age < 55 && person.sex == Person.Sex.WOMAN
                || person.age >= 18 && person.age < 60 && person.sex == Person.Sex.MAN).count());

    }
}
