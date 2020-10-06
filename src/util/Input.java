package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    String getString(){
        String userString = sc.nextLine();
        return userString;
    }

    boolean yesNo() {
        System.out.println("Yes or no?");
        String userString = sc.nextLine();
        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

     int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        int userInput = sc.nextInt();

        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getInt(min, max);
        }
//        System.out.printf("Great choice, %d is a good number!\n", userInput);
        return userInput;
    }

    int getInt() {
        System.out.print("Give me any number.");
        int userInput = sc.nextInt();
        return userInput;
    }

    double getDouble(double min, double max) {
        System.out.printf("Give me a number between %s and %s\n", min, max);
        double userInput = sc.nextDouble();
        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getDouble(min, max);
        }
        return userInput;
    }

    double getDouble() {
        System.out.print("Give me any number with a decimal.");
        double userInput = sc.nextDouble();
        return userInput;
    }

}