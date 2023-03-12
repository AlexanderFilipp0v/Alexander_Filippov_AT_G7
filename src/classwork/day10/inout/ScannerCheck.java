package classwork.day10.inout;

import java.util.Scanner;

public class ScannerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("STOP")) {
                System.out.println("Finished!");
                break;
            }
            System.out.printf("You say '%s' ! ", incoming);
        }
    }
}
