public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);
//        char myString = "Howdy, World!";
//        does not work because char is for a single unicode character
//        String myString = 3.14159;
//        Does not work because 3.14159 is not a string, it is an int.
        String myString = "Howdy, World!";
        System.out.println(myString);
//        Just declaring a variable and then trying to print it does not work because a value was not initialized.
        float myNumber;
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//        myNumber = 3.14;
//        change the declaration to float and adding an F to the end of the value helps to solve the 3.14 issue
        myNumber = 3.14F;
        System.out.println(myNumber);
    }
}
