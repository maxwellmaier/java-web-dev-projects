package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    // Constructor
    public TrueFalse(String text, int pointValue, boolean b) {
        super(text, pointValue);
    }

    // Override displayAnswers method
    @Override
    public void displayAnswers() {
        System.out.println("True or False?");
    }

    // Override checkAnswer method
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase("true") || userAnswer.equalsIgnoreCase("false");
    }

    @Override
    public int getAnswers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer (True/False): ");
        String userInput = scanner.nextLine().toLowerCase();
        boolean userAnswer = userInput.equals("true");
        return userAnswer == correctAnswer ? 1 : 0;
    }

}

