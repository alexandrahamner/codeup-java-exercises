import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
// 1.) Array Basics
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        //This prints out the reference ID of the numbers array.

        System.out.println("numbers: " + Arrays.toString(numbers));
        //You use Arrays.toString to convert the array into a string in order to see the elements within the array.

        Person[] persons = new Person[3];
        persons[0] = new Person("Ally");
        persons[1] = new Person("Luna");
        persons[2] = new Person("Guera");

        for(Person individual : persons) {
            System.out.println(individual.getName());
        }

        //Testing the addPerson method.
        addPerson(persons, new Person("Andrew"));
    }

    public static void addPerson(Person[] arr, Person individualToAdd){
        //Makes a copy of a Person array and makes it one more person longer.
        Person[] newPersonArray = Arrays.copyOf(arr, arr.length + 1);
        //Puts the individual you need to add to the last index in the copied array.
        newPersonArray[newPersonArray.length - 1] = individualToAdd;
        //Loops through the array and prints out each individual from the copied Array, including the new individual.
        for(Person individual : newPersonArray) {
            System.out.println(individual.getName());
        }
    }
}
