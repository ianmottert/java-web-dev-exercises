package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayListPlanets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        HashMap<String, Integer> moons = new HashMap<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        System.out.println(planets.size());
        System.out.println(planets.contains("Jupiter"));
        System.out.println(planets.indexOf("Jupiter"));

        Collections.sort(planets);
        System.out.println(planets);

        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);

        System.out.println(moons.size());
        System.out.println(moons.keySet());
        System.out.println(moons.values());
        System.out.println(moons.containsKey("Earth"));
        System.out.println(moons.containsValue(79));
        System.out.println(moons.get("Mars"));
    }
}
