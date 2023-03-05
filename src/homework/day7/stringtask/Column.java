package homework.day7.stringtask;

public class Column {
    public void methodColumn(String Strings) {

        char[] charArray = Strings.toCharArray();
        System.out.print("Length of charArray: " + charArray.length);

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
