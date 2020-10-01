public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 2;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        do {
//            System.out.print(i + "\n");
//            i += 2;
//        } while (i <= 100);

//Alter your loop to count backwards by 5's from 100 to -10.
//        do {
//            System.out.print(i + "\n");
//            i -= 5;
//        } while (i >= -10);

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.print(i + "\n");
//            i *= i;
//        } while (i  <= 1000000);

//Refactor the previous two exercises to use a for loop instead.
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + "\n");
        }

        for (int i = 100; i >= -10; i -= 5) {
            System.out.print(i + "\n");
        }

        for (long i = 2; i <= 1000000; i *= i) {
            System.out.print(i + "\n");
        }


//  Fizzbuzz
/*  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

    Write a program that prints the numbers from 1 to 100.
    For multiples of three: print “Fizz” instead of the number.
    For the multiples of five: print “Buzz”.
    For numbers which are multiples of both three and five: print “FizzBuzz”.

 */

        for (int x = 1; x <= 100; x++) {
            if (((x % 5) == 0) && ((x % 3) == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(x);

            }
        }

    }
}
