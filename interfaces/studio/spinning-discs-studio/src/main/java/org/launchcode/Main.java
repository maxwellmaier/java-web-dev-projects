package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // Create a CD object
        CD myCd = new CD("Now That's What I Call Music Vol: 69", "Music Compilation", "Popular Music", 500);

        // Create a DVD object
        DVD myDvd = new DVD("Dumb and Dumber", "Movie", "Funnies Movie Ever Made", 2);

        // Call methods for CD
        myCd.spinDisc();
        myCd.writeData("Some data for the CD");
        myCd.readData();


        // Call methods for DVD
        myDvd.spinDisc();
        myDvd.writeData("Some data for the DVD");
        myDvd.readData();
        System.out.println("Layer count: " + myDvd.getLayerCount());
    }
}