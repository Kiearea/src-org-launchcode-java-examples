package org.launchcode.java.examples.CountingCharactersStudio;


public class CharCounter {
    public static void main(String args[]) {
        String testString = "Lorem ipsum dolor sit " +
                "amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula " +
                "scelerisque sollicitudin. Ut at " +
                "" +
                "" +
                "sagittis augue. Praesent quis " +
                "rhoncus justo. Aliquam erat volutpat." +
                " Donec sit amet suscipit metus, non" +
                " lobortis massa. Vestibulum augue ex," +
                " dapibus ac suscipit vel, volutpat " +
                "eget massa. Donec nec velit non " +
                "ligula efficitur luctus.";

        charCounter(testString);
    }

    public static void charCounter(String str) {
        int c = 0;
        str = str.toLowerCase();
        String alphaBet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaArray = alphaBet.toCharArray();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < alphaArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (alphaArray[i] == strArray[j]) {
                    c++;
                }
            }
            System.out.printf("%s :", alphaArray[i]);
            System.out.printf("%d\n", c);
            c = 0;
        }
    }
}

