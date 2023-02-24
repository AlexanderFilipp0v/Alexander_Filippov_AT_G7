import java.util.Random;

public class Task {

    public static void main(String[] args) {
        new Task().foo();

    }

    public void foo() {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);
        }
        for (int i : array) {
            System.out.println(i);
        }


        int fin = 0;
        for (int i : array) {
            fin += i;
        }

        System.out.println();
        System.out.println("Average value is: " + fin / array.length);
    }

}
