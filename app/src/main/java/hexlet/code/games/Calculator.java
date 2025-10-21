package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Calculator {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static int calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            default:
                return 0;
        }
    }

    public static void startGame() {
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int number1 = random.nextInt(100) + 1;
            int number2 = random.nextInt(100) + 1;
            char operator = OPERATORS[random.nextInt(OPERATORS.length)];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }

        Engine.run(DESCRIPTION, data);
    }
}


