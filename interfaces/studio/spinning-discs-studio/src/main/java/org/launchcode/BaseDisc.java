package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {

    // Fields
    private String name;
    private String type;
    private String contents;

    // Constructors
    public BaseDisc(String name, String type, String contents) {
        this.name = name;
        this.type = type;
        this.contents = contents;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    // Custom methods
    public void loadDisc(String contents) {
        System.out.println("Loading contents: " + contents);
        setContents(contents);
    }

    // Abstract method from OpticalDisc interface
    @Override
    public abstract void spinDisc();

    // Abstract method from OpticalDisc interface
    @Override
    public abstract void storeData();

    // Abstract method from OpticalDisc interface
    @Override
    public abstract void readData();

    // Abstract method from OpticalDisc interface
    @Override
    public abstract void playOrAccess();
}
