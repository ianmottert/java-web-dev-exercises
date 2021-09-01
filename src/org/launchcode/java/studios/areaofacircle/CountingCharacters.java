package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            if (!charCount.containsKey(charArr[i])) {
                charCount.put(charArr[i], 1);
            } else if (charCount.containsKey(charArr[i])) {
                charCount.put(charArr[i], charCount.get(charArr[i]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> key : charCount.entrySet()) {
            System.out.println(key.getKey() + ": " + key.getValue());
        }

    }
}
