package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            question.displayQuestion();
            question.displayAnswers();

            // Call the appropriate getAnswers method based on the question type
            int questionScore = 0;
            if (question instanceof Checkbox) {
                questionScore = ((Checkbox) question).getAnswers();
            } else if (question instanceof TrueFalse) {
                questionScore = ((TrueFalse) question).getAnswers();
            } else if (question instanceof MultipleChoice) {
                questionScore = ((MultipleChoice) question).getAnswers();
            }

            this.score += questionScore;
        }
    }

    public void gradeQuiz() {
        System.out.println("Quiz completed. Your score is: " + score + "/" + questions.size());
    }
}


