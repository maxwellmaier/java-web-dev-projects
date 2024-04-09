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

    public Date getLastUpdated() {
        return lastUpdated;
    }
}

