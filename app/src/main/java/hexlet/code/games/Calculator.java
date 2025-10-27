package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Calculator {
    static final int NUMBERS_COUNT = 100;

    public static int calculate(int operand1, int operand2, char operator) {

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            default:
                throw new RuntimeException("Unknown operator" + operator);
        }
    }

    public static void startGame() {
        String description = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        String[][] data = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = random.nextInt(NUMBERS_COUNT) + 1;
            int number2 = random.nextInt(NUMBERS_COUNT) + 1;
            char operator = operators[random.nextInt(operators.length)];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }

        Engine.run(description, data);
    }
}
