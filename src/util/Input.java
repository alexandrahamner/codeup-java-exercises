package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

//Has to be in a constructor method, Java rule. All functionality happens in the methods.
    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return getString("Type out a sentence.");
    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userString = this.sc.nextLine();
        return userString;
    }

    public boolean yesNo() {
        return yesNo("Yes or No?");
    }

    //Prompt Bonus
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userString = this.sc.nextLine();
        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

     public int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        int userInput = sc.nextInt();

        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        return getInt("Give me any number.");
    }

//Prompt Bonus
    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInput = this.sc.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a number between %f and %f\n", min, max);
        double userInput = this.sc.nextDouble();
        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Give me any number with a decimal.");
        double userInput = this.sc.nextDouble();
        sc.nextLine();
        return userInput;
    }

}
