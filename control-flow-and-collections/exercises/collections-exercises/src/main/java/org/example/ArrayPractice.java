package org.launchcode;
import java.util.ArrayList;
//import java.util.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.example.Main.sumEven;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println("All values:");
        for (int i : integerArray) {
            System.out.println(i);
        }
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sumOfEvenNumbers = sumEven(numbers);
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        String[] fruitwords = {"apple", "banana", "orange", "grape", "kiwi", "melon", "peach"};

        System.out.println("Words with exactly 5 letters:");
        printWordsWithFiveLetters(words);
    }

    public static void printWordsWithFiveLetters(String[] words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

        public static int sumEven (ArrayList < Integer > arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
    }



