package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkbox extends Question {

    private List<String> possibleAnswers;
    private List<Integer> correctOptions;

    public Checkbox(String text, int pointValue, List<Integer> correctOptions, List<String> possibleAnswers) {
        super(text, pointValue);
        this.correctOptions = correctOptions;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println((i + 1) + ". " + possibleAnswers.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        String[] inputArray = userAnswer.split(",");
        List<Integer> userOptions = new ArrayList<>();
        for (String s : inputArray) {
            int option = Integer.parseInt(s.trim()) - 1;
            userOptions.add(option);
        }
        return userOptions.equals(correctOptions);
    }


    @Override
    public int getAnswers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of the correct options separated by commas (e.g., 1,2):");
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split(",");
        int score = 0;
        for (String s : inputArray) {
            int answer = Integer.parseInt(s.trim()) - 1;
            if (correctOptions.contains(answer)) {
                score++;
            }
        }
        return score;
    }

}