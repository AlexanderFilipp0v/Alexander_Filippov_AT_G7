package homework.day5;

import java.time.LocalDate;

public class ArrayTask {

    public static void main(String[] args) {
        ArrayTask x = new ArrayTask();
        //x.methodNSum();
        //x.methodMNReverse();
        x.methodMonth();
        x.methodPicture();
    }
    //public void methodNSum() {
    //int [] array = {1,2,3,4,5,6,7,8,9};

    //for (int i = 0; i < array.length; i++) {
    //System.out.print(array[i] + " ");
    //}
    //System.out.println();
    //}

    //public void methodMNReverse() {
    //int [] array = {1,2,3,4,5,6,7,8,9};

    //for (int i = 0; i < array.length; i++) {
    //System.out.print(array[i] + " ");
    //}
    //System.out.println();
    //}

    public void methodMonth() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        
        for (int i : array) {
            if (i % month == 0)
                sum = sum + i;

        }
        System.out.println(sum);
    }


    public void methodPicture() {

        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}
