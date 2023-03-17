package homework.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("TextFileReading.txt"));
        String line;
        int marks = 0;
        int words = 0;
        while ((line = in.readLine()) != null) {
            String[] wordsArray1 = line.split("[\\p{Punct}\\d\\s]+");
            System.out.println(line);
            words = (words + wordsArray1.length);
            int countPunctuationLine = line.length() - line.replaceAll("\\p{Punct}", "").length();
            marks = (marks + countPunctuationLine);
        }
        in.close();
        System.out.printf("Знаков препинания - %s, слов - %s.", marks, words).println();
    }
    }

