public class MethodsExercises {
    public static void main(String[] args) {
//Basic Arithmetic
        System.out.println( sum(4, 5) );
        System.out.println( difference(4, 5) );
        System.out.println( multiplication(4, 5) );
        System.out.println( division(4, 0) );
        System.out.println( modulus(4, 5) );
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

//Food for thought: What happens if we try to divide by zero? What should happen?
//Your return is Infinity but it should be zero, because any number divided by zero is zero.

}
