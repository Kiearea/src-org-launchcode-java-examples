package org.launchcode.java.examples.CountingCharactersStudio;

import java.util.ArrayList;
import java.util.HashMap;

public class CountingCharactersStudio {
    static void hashMapMethod(String text) {

        HashMap<Character, Integer> counts = new HashMap<>(100); /*initialCapacity can be set to whatever you want*/

        for (char c : text.toCharArray()) {
            Integer newCount = counts.getOrDefault(c, 0) + 1;
            counts.put(c, newCount);
        }

        for (HashMap.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void listMethod(String text) {
        ArrayList<Integer> counts = new ArrayList<>();
        /*number of ascii characters = 128*/
        for (int i = 0; i < 128; i++) {
            counts.add(0);
        }

        for (char c : text.toCharArray()) {
            Integer newCount = counts.get(c) + 1;
            counts.set(c, newCount);
        }

        for (char c = 0; c < 128; c++) {
            Integer count = counts.get(c);
            if (count > 0) {
                System.out.println(c + ":" + count);
            }
        }
    }


    static void arrayMethod(String text) {
        int[] counts = new int[128];

        for (char c : text.toCharArray()) {
            counts[c]++;
        }

        for (char c = 0; c < 128; c++) {
            int count = counts[c];
            if (count > 0) {
                System.out.println(c + ":" + count);
            }
        }
    }


    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        arrayMethod(text); /*you can change the method (array, hash, arrayList) so you can see how each one prints*/
    }
}