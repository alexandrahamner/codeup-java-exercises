import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int userInput = sc.nextInt();

        int range = (100 - 1) + 1;
        int randomNumber = (int)(Math.random() * range) + 1;
        //Limit to 10 guesses
        int numberOfUserGuesses = 0;

        do {
            if(numberOfUserGuesses == 10) {
                System.out.println("Uh oh! You have reached your limit of guesses!");
                System.out.println("Did you want to try again? [y/n]");
                String userAnswer = sc.next();
                if(userAnswer.equalsIgnoreCase("y")) {
                    guessingGame();
                } else {
                    return;
                }
            }
            if(userInput < randomNumber) {
                System.out.println("HIGHER");
                numberOfUserGuesses += 1;
                System.out.printf("You have %d guess(es) left!\n", (10 - numberOfUserGuesses) );
                System.out.println("Take another guess.");
                userInput = sc.nextInt();
            }
            if (userInput > randomNumber) {
                System.out.println("LOWER");
                numberOfUserGuesses += 1;
                System.out.printf("You have %d guess(es) left!", (10 - numberOfUserGuesses) );
                System.out.println("Take another guess.");
                userInput = sc.nextInt();
            }
            if (userInput == randomNumber) {
                System.out.println("Correct! That was a great guess, good job!");
                System.out.println("Did you want to play again?");
                String userAnswer = sc.next();
                if(userAnswer.equalsIgnoreCase("y")) {
                    guessingGame();
                } else {
                    return;
                }
            }

        } while (userInput != randomNumber);
    }
}
