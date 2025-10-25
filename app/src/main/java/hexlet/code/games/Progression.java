package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Progression {
    public static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int index = 0; index < length; index++) {
            progression[index] = String.valueOf(start + index * step);
        }
        return progression;
    }

    public static void startGame() {
        String description = "What number is missing in the progression?";
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();
        int startNumber = 60;
        int stepNumber = 10;
        int hiddenNumber = 10;


        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int start = random.nextInt(startNumber) + 1;
            int step = random.nextInt(stepNumber) + 1;
            int hiddenIndex = random.nextInt(hiddenNumber);
            int length = 10;

            String[] progression = generateProgression(start, step, length);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);


            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.run(description, data);
    }
}

