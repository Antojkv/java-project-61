package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static int getRoundsCount() {
        return ROUNDS;
    }

    public static void run(String description, String[][] data) {
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.greetUser();
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ROUNDS; i++) {
            String question = data[i][0];
            String correctAnswer = data[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();

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
