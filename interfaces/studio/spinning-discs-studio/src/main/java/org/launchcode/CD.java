package org.launchcode;

public class CD extends BaseDisc {

    // Fields specific to CD
    private int spinSpeed;

    // Constructor
    public CD(String name, String type, String contents, int spinSpeed) {
        super(name, type, contents);
        this.spinSpeed = spinSpeed;
    }

    // Getter and setter for spinSpeed
    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
    public void writeData(String data) {
        System.out.println("Writing data to CD: " + data);
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void spinDisc() {
        System.out.println("CD is spinning at " + spinSpeed + "x speed.");
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void storeData() {
        System.out.println("Storing data on CD: " + getContents());
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void readData() {
        System.out.println("Reading data from CD: " + getContents());
    }

    // Implementing interface method from OpticalDisc
    @Override
    public void playOrAccess() {
        System.out.println("Playing CD: " + getName());
    }

    // Add any additional methods specific to CD
}
