import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//Basic Arithmetic
        System.out.println( sum(4, 5) );
        System.out.println( difference(4, 5) );
        System.out.println( multiplication(4, 5) );
        System.out.println( division(4, 0) );
        System.out.println( modulus(4, 5) );

//Create a method that validates that user input is in a certain range
        System.out.println( getInteger(1, 10) );
    }

//Basic Arithmetic
    public static int sum(int a, int b) {
            return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

/*
Food for thought: What happens if we try to divide by zero? What should happen?
Your return is Infinity but it should be zero, because any number divided by zero is zero.
*/

//Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getInteger(min, max);
        }
        System.out.printf("Great choice, %d is a good number!\n", userInput);
        return userInput;
    }


}
