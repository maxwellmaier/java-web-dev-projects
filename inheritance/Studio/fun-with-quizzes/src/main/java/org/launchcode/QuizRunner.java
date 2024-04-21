package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {

    public static void main(String[] args) {
        // Create a list to hold questions
        List<Question> questions = new ArrayList<>();

        // Add multiple choice question
        questions.add(new MultipleChoice("What is the capital of France?", 1, 0, List.of("Paris", "London", "Berlin")));

        // Add checkbox question
        questions.add(new Checkbox("Which of the following are programming languages?", 1,
                List.of(0, 2), List.of("Java", "Python", "C++", "JavaScript")));

        // Add true/false question
        questions.add(new TrueFalse("Java is an object-oriented programming language.", 1, true));

        // Create a quiz with the list of questions
        Quiz quiz = new Quiz(questions);

        // Run the quiz
        quiz.runQuiz();

        // Grade the quiz
        quiz.gradeQuiz();
    }
}


