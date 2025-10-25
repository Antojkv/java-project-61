package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return  true;
    }

    public static void startGame() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int numbersCount = 100;

            int number = random.nextInt(numbersCount) + 1;
            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}
