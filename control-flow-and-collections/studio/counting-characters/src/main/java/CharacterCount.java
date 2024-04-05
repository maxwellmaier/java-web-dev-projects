import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String hiddenFiguresInput = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


        HashMap<Character, Integer> hiddenFiguresCharCounts = countCharacters(hiddenFiguresInput);
        System.out.println("Character counts for Hidden Figures:");
        printCharacterCounts(hiddenFiguresCharCounts);


        System.out.print("\nEnter a string: ");
        String userInput = scanner.nextLine();


        HashMap<Character, Integer> userCharCounts = countCharacters(userInput);
        System.out.println("\nCharacter counts for user input:");
        printCharacterCounts(userCharCounts);

        scanner.close();
    }

    // Method to count occurrences of characters in a string
    public static HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char i : input.toCharArray()) {
            charCounts.put(i, charCounts.getOrDefault(i, 0) + 1);
        }
        return charCounts;
    }

    // Method to print character counts
    public static void printCharacterCounts(HashMap<Character, Integer> charCounts) {
        for (char c : charCounts.keySet()) {
            System.out.println(c + ": " + charCounts.get(c));
        }
    }
}

