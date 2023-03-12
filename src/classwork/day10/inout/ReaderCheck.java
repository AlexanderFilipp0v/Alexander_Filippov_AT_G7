package classwork.day10.inout;

import java.io.*;

public class ReaderCheck {
    public static void main(String[] args) throws IOException {

        ReaderCheck readerCheck = new ReaderCheck();
        readerCheck.read();
        readerCheck.write();
    }

    public static void read() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("mama mila ramy");
        out.close();
    }
}
