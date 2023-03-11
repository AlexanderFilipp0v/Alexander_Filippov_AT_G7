package classworkday7;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(objectContainer.removeLast());
        }

    }
}
