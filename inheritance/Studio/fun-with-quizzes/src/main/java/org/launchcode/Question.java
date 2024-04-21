package org.launchcode;

public abstract class Question {

    // Fields
    private String text;
    private int pointValue;

    // Constructor
    public Question(String text, int pointValue) {
        this.text = text;
        this.pointValue = pointValue;
    }

    // Methods
    public void displayQuestion() {
        System.out.println(text);
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void displayAnswers();

    public abstract boolean checkAnswer(String userAnswer);

    public abstract int getAnswers();
}
