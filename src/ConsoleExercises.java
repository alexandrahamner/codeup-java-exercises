import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your favorite number?");
//        int userNumber = sc.nextInt();
//        System.out.printf("Your number was %d.", userNumber);
//        When you input a response that is not an int, you receive the error message: "Exception in thread "main" java.util.InputMismatchException"

        System.out.println("Quick! Give me 3 random words!");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.printf("The 3 words you came up with were: %s, %s, and %s", firstWord, secondWord, thirdWord);
//        If you enter more than three words, only the first 3 words are taken in.
//        If you enter less than three words, it waits until you give a third word.

    }
}
