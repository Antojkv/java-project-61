package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static String userChoice;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        userChoice = scanner.next();

        switch (userChoice) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetUser();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calculator.startGame();
                break;
            case "4":
                Gcd.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Unknown user choice: " + userChoice);
                break;
        }

        scanner.close();
    }
}
