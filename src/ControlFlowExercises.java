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
        long i = 2;
        do {
            System.out.print(i + "\n");
            i *= i;
        } while (i  <= 1000000);
    }
}
