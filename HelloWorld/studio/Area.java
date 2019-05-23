

package org.launchcode.java.examples.HelloWorld.studio;

import java.util.Scanner;

public class Area {

    static double areaOfCircle(double radius) {
        double pi = 3.14;
        double num = pi * radius * radius;
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("The area is ");
        System.out.println(areaOfCircle(r));
    }
}

