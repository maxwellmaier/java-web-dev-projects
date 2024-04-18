package technology;

public class Program {
    public static void main(String[] args) {
        // Create a Computer
        Computer computer = new Computer("Dell", "XPS 15", 1500.0);
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("Price: $" + computer.getPrice());

        // Create a Laptop
        Laptop laptop = new Laptop("Apple", "MacBook Pro", 2000.0, 13.3);
        System.out.println("\nBrand: " + laptop.getBrand());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Screen Size: " + laptop.getScreenSize() + " inches");

        // Create a SmartPhone
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S21", 1000.0, "Android");
        System.out.println("\nBrand: " + smartPhone.getBrand());
        System.out.println("Model: " + smartPhone.getModel());
        System.out.println("Price: $" + smartPhone.getPrice());
        System.out.println("Operating System: " + smartPhone.getOperatingSystem());
    }
}
