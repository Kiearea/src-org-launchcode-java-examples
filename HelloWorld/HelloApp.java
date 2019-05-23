package org.launchcode.java.examples.HelloWorld;

public class HelloApp {

    public static String fizzbuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else {
            return new Integer(n).toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(325));
    }
}
