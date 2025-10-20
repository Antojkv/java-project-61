package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getRoundsCount() {
        return ROUNDS;
    }

    public static void run(String description, String[][] data) {
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.greetUser();
        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = data[i][0];
            String correctAnswer = data[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = SCANNER.next();

            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
