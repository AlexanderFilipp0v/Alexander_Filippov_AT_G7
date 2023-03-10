package homework.day7.stringtask;

public class Duplicates {

    public void DuplicatesWords(String text) {
        String[] wordsArray = text.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    System.out.println(wordsArray[i]);
                }
            }
        }
    }
}
