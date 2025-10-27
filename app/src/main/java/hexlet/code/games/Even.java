package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Even {
    static final int NUMBERS_COUNT = 100;

    public static void startGame() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();


        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number = random.nextInt(NUMBERS_COUNT) + 1;
            String question = String.valueOf(number);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}
