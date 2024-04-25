package org.launchcode;

public interface OpticalDisc {

    // Constant fields
    String CD_TYPE = "CD";
    String DVD_TYPE = "DVD";

    // Method signatures for behaviors
    void spinDisc();
    void storeData();
    void readData();
    void playOrAccess();

}
