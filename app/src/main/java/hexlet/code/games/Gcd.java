package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Gcd {
    static final int NUMBERS_COUNT = 100;

    private static int theGCD(int a, int b) {
        while (b != 0) {
            int value = b;
            b = a % b;
            a = value;
        }
        return a;
    }

    public static void startGame() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] data = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = random.nextInt(NUMBERS_COUNT) + 1;
            int number2 = random.nextInt(NUMBERS_COUNT) + 1;
            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(theGCD(number1, number2));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}
