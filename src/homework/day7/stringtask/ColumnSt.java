package homework.day7.stringtask;

public class ColumnSt {

    public static void methodColumn(String Strings) {

        char[] charArray = Strings.toCharArray();
        //System.out.print("Length of charArray: " + charArray.length);
        System.out.println();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
