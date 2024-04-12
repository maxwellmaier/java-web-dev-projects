package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {


    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        this.lastUpdated = new Date();
    }

    public boolean isNewMenuItem(MenuItem menuItem) {
        return menuItem.isNewItem();
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.println(menuItem.getName());
        System.out.println("Description: " + menuItem.getDescription());
        System.out.println("Category: " + menuItem.getCategory());
        System.out.println("Price: " + menuItem.getPrice());
        System.out.println("Last Updated: " + menuItem.getLastUpdated());
        System.out.println("Is New: " + isNewMenuItem(menuItem));
    }

    public void printMenu() {
        for (MenuItem item : menuItems) {
            printMenuItem(item);
            System.out.println("----------------------");
        }
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }


}

