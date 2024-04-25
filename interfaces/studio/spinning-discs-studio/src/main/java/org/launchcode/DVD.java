package org.launchcode;

public class DVD extends BaseDisc {

    // Fields specific to DVD
    private int layerCount;

    // Constructor
    public DVD(String name, String type, String contents, int layerCount) {
        super(name, type, contents);
        this.layerCount = layerCount;
    }

    // Getter and setter for layerCount
    public int getLayerCount() {
        return layerCount;
    }

    public void setLayerCount(int layerCount) {
        this.layerCount = layerCount;
    }

    public void writeData(String data) {
        System.out.println("Writing data to DVD: " + data);
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning.");
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void storeData() {
        System.out.println("Storing data on DVD: " + getContents());
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void readData() {
        System.out.println("Reading data from DVD: " + getContents());
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void playOrAccess() {
        System.out.println("Accessing DVD: " + getName());
    }

    // Add any additional methods specific to DVD
}
