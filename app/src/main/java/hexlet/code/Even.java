package hexlet.code;
import java.util.Scanner;
import java.security.SecureRandom;

public class Even {
    public static boolean generateNumber(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        int correctAnswerCount = 0;
        final int rounds = 3;
        while (correctAnswerCount <= rounds) {
            SecureRandom random = new SecureRandom();
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            boolean isCorrect = number % 2 == 0 ? answer.equals("yes") : answer.equals("no");
            if (isCorrect) {
                correctAnswerCount++;
                System.out.println("Correct!");
                if (correctAnswerCount == rounds) {
                    System.out.println("Congratulations, " + userName + "!");
                    return true;
                }
            } else {
                String correctAnswer = number % 2 == 0 ? "'yes'" : "'no'";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer
                        + ".\nLet's try again, " + userName + "!");
                return false;
            }
        }
        return true;
    }
}

