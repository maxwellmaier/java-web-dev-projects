package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String firstSentence = input.nextLine();

        System.out.println("Enter a word to search for in the sentence:");
        String searchTerm = input.next();

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println("The modified sentence after removing the word: " + modifiedSentence);
    }
}

