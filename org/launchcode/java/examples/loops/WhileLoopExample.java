package org.launchcode.java.examples.org.launchcode.java.examples.loops;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";
        while (!response.equals("y") && !response.equals("n")) {
            System.out.print("Do you accept? [y/n]: ");
            response = sc.next();
            if (!response.equals("y") && (!response.equals("n"))) {
                System.out.println("You must answer y or n");
            }
        }
    }
}
