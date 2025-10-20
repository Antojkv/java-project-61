package hexlet.code.games;
import hexlet.code.Engine;

import java.security.SecureRandom;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void startGame() {
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int number = random.nextInt(100) + 1;
            String question = String.valueOf(number);
            String correctAnswer = isEven(number) ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }

        Engine.run(DESCRIPTION, data);
    }


}
