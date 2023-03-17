package homework.day10;

import java.io.File;

public class ListOfFiles {
    public static void main(String[] args) {
        File file = new File("d:/");
        for (File item : file.listFiles()) {
            System.out.println(item.getName());
        }
    }
}
