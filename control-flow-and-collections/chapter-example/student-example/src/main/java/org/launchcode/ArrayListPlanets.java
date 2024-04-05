package org.launchcode;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPlanets {
    public static void main(String[] args){
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        Collections.sort(planets);
        System.out.println("Planets in our solar system:");
        for (String planet : planets) {
            System.out.println(planet);
        }
    }
}
