package technology;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}