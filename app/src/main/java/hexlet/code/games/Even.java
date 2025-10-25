package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Even {
    public static void startGame() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();


        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int numbersCount = 100;

            int number = random.nextInt(numbersCount) + 1;
            String question = String.valueOf(number);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}
