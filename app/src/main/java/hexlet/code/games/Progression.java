package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Progression {
    static final int START_NUMBER = 60;
    static final int STEP_NUMBER = 10;
    static final int HIDDEN_NUMBER = 10;
    static final int LENGTH = 10;

    public static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int index = 0; index < length; index++) {
            progression[index] = String.valueOf(start + index * step);
        }
        return progression;
    }

    public static void startGame() {
        String description = "What number is missing in the progression?";
        String[][] data = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();



        for (int i = 0; i < Engine.ROUNDS; i++) {

            int start = random.nextInt(START_NUMBER) + 1;
            int step = random.nextInt(STEP_NUMBER) + 1;
            int hiddenIndex = random.nextInt(HIDDEN_NUMBER);

            String[] progression = generateProgression(start, step, LENGTH);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);


            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}

