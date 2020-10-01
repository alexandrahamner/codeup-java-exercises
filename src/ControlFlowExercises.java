public class ControlFlowExercises {

    public static void main(String[] args) {
        int i = 100;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        do {
//            System.out.print(i + "\n");
//            i += 2;
//        } while (i <= 100);

        do {
            System.out.print(i + "\n");
            i -= 5;
        } while (i >= -10);
    }
}
