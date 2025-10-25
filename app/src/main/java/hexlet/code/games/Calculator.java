package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Calculator {

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
        String description = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        String[][] data = new String[Engine.getRoundsCount()][2];
        SecureRandom random = new SecureRandom();
        int numbersCount = 99;


        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int number1 = random.nextInt(numbersCount) + 1;
            int number2 = random.nextInt(numbersCount) + 1;
            char operator = operators[random.nextInt(operators.length)];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }

        Engine.run(description, data);
    }
}
