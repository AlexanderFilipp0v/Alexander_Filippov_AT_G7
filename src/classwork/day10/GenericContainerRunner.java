package classwork.day10;

import classwork.day7.ObjectContainer;

public class GenericContainerRunner {
    public static void main(String[] args) {

        GenericContainer<Integer> genericContainer = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            genericContainer.add(i);
        }
        while (!genericContainer.isEmpty()) {
            System.out.println(genericContainer.removeLast());
        }

    }
}
