package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String digit = scanner.next();
        System.out.println("Your choice: " + digit);

        if (digit.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greetUser();
        } else if (digit.equals("0")) {
            System.out.println("Goodbye!");
        } else if (digit.equals("2")) {
            System.out.println("Welcome to the Brain Games!");
            String userName = Cli.greetUser();
            Even.generateNumber(userName);
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
