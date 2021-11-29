package io.peopleintech;

public class Main {

    public static void main(String[] args) {
        String firstName = "Caleb";
        String lastName = "King";
        String output = firstName + " " + lastName;
        System.out.println("Here is my first output " + output);

        int number = 6;
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 AND 3");
        }
        if (number % 2 == 0 || number % 5 == 0) {
            System.out.println(number + " is divisible by 2 OR 5");
        }

    }
}
