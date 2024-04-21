package org.launchcode;

import java.util.List;
import java.util.Scanner;

public class MultipleChoice extends Question {

    // Fields
    private List<String> options;
    private int correctOption;

    // Constructor
    public MultipleChoice(String text, int pointValue, int correctOption, List<String> options) {
        super(text, pointValue);
        this.options = options;
        this.correctOption = correctOption;
    }


    // Override displayAnswers method
    @Override
    public void displayAnswers() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Override checkAnswer method
    @Override
    public boolean checkAnswer(String userAnswer) {
        int userChoice = Integer.parseInt(userAnswer);
        return userChoice == correctOption;
    }

    @Override
    public int getAnswers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the correct option:");
        int userAnswer = scanner.nextInt();
        return userAnswer == correctOption ? 1 : 0;
    }
}
