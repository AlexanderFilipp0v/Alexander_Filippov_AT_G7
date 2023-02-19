package cycletask;

import java.util.Random;

public class ArrayWithRandomElements {

    int[] array1 = new int[7];
    int[] array2 = new int[7];
    int[] array3 = new int[7];


    public void ArrayWithRandomElementsCreationAndOutput() {
        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(50);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public void ArrayReverse() {
        for (int i = 6; i > -1; i--) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

    }

    public void ArrayMultipliedByFive() {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i] * 5;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

    }

    public void ArrayMultipliedByItself() {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array1[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();

    }

    public void ArrayMin() {
        int amin = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < amin) {
                amin = array1[i];
            }
        }
        System.out.println(amin);
    }

    public void ArrayFirstLast() {
        int temp1 = array1[0];
        array1[0] = array1[6];
        array1[6] = temp1;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public void ArraySort() {
        for (int i = 0; i < array1.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < array1[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array1[i];
            array1[i] = array1[minIndex];
            array1[minIndex] = temp;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
