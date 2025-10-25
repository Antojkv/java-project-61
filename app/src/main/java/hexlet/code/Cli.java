package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {
    }
    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;

    }
}
