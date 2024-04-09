package org.launchcode;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private Date lastUpdated;

    public MenuItem(String name, String description, String category, double price, Date lastUpdated) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isNewItem() {
        Date today = new Date();
        long thirtyDaysInMillis = 30L * 24 * 60 * 60 * 1000; // 30 days in milliseconds
        Date thirtyDaysAgo = new Date(today.getTime() - thirtyDaysInMillis);
        return lastUpdated.compareTo(thirtyDaysAgo) >= 0;
    }
}
