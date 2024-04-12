package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Create a new menu
        Menu menu = new Menu();

        // Add some menu items
        MenuItem item1 = new MenuItem("Cheeseburger", "Juicy beef patty topped with melted cheese, lettuce, tomato, and pickles on a sesame seed bun.", "Main Course", 9.99, new Date(12/5/2024));
        MenuItem item2 = new MenuItem("Caesar Salad", "Fresh romaine lettuce tossed in creamy Caesar dressing with crunchy croutons and shredded Parmesan cheese.", "Appetizer", 6.99, new Date(3/1/2024));
        MenuItem item3 = new MenuItem("Chocolate Brownie Sundae", "Warm, fudgy chocolate brownie topped with vanilla ice cream, whipped cream, and chocolate sauce.", "Dessert", 7.99, new Date(2/28/2024));

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        // Print the menu
        System.out.println("Full Menu:");
        menu.printMenu();

        // Remove an item
        menu.removeMenuItem(item2);

        // Print the updated menu
        System.out.println("\nUpdated Menu:");
        menu.printMenu();

        // Print the last updated date
        System.out.println("\nLast Updated: " + menu.getLastUpdated());

        // Print an item
        System.out.println("\nPreferred Dish: " + item1.toString());
    }
}
