package homework.day5;

import java.time.LocalDate;

public class ArrayTask {

    public static void main(String[] args) {
        ArrayTask x = new ArrayTask();
        x.methodNSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
        //x.methodMNReverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
        x.methodMonth(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31});
        x.methodPicture();
    }

    public void methodNSum(int[] array, int n) {
        int sum = 0;

        for (int i : array) {
            if (i % n == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);


    }

    //public void methodMNReverse(int[] array, int n) {
        //int[] arrayn = new int[array.length];
        //for (int i : array) {
            //if (array[i] > n) {
                //arrayn[i] = array[i];

                //System.out.print(arrayn[i]);



            //}


        //}
        //System.out.println();
    //}

    public void methodMonth(int[] array) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int summ = 0;


        for (int i : array) {
            if (i % month == 0)
                summ = summ + i;

        }
        System.out.println(summ);
    }


    public void methodPicture() {

        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}

