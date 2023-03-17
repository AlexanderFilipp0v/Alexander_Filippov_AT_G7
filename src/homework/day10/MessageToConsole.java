package homework.day10;

import java.util.Scanner;

public class MessageToConsole {
    public static void main(String[] args) {
        Scanner message = new Scanner(System.in);
        while (message.hasNext()) {
            String incoming = message.nextLine();
            if (incoming.equals("STOP")) {
                System.out.println("Finished!");
                break;
            }
            System.out.printf("Hello, I just got '%s' from you ! ", incoming);
        }
    }

}
