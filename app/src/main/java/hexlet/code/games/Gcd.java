package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    private static int isGCD(int a, int b) {
        while (b != 0) {
            int value = b;
            b = a % b;
            a = value;
        }
        return a;
    }

    public static void startGame() {
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int number1 = random.nextInt(100) + 1;
            int number2 = random.nextInt(100) + 1;
            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(isGCD(number1, number2));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, data);
    }

}
