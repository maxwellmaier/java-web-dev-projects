package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class IceCreamRunner {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        flavors.sort(comparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(flavors.toString());



    }
}