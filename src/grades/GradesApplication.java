package grades;
import java.util.HashMap;
import util.Input;


public class GradesApplication {

    public static void main(String[] args) {
        // Hash Map
        HashMap<String, Student> students = new HashMap<>();

        // Student Variables
        Student luna = new Student("Luna");
        Student andrew = new Student("Andrew");
        Student emily = new Student("Emily");
        Student liz = new Student("Liz");

        // Add grades to each student
        // Luna
        luna.addGrade(87);
        luna.addGrade(90);
        luna.addGrade(75);
//        System.out.println("Luna's Grades: " + luna.getGradeAverage(luna.getGrades()));

        // Andrew
        andrew.addGrade(96);
        andrew.addGrade(92);
        andrew.addGrade(85);
//        System.out.println("Andrew's Grades: " + andrew.getGradeAverage(andrew.getGrades()));

        //Emily
        emily.addGrade(82);
        emily.addGrade(87);
        emily.addGrade(85);
//        System.out.println("Emily's Grades: " + emily.getGradeAverage(emily.getGrades()));

        //Liz
        liz.addGrade(72);
        liz.addGrade(84);
        liz.addGrade(90);
//        System.out.println("Liz's Grades: " + liz.getGradeAverage(liz.getGrades()));

        //Add Students to HashMap
        students.put("lunatic-15", luna);
        students.put("andrewC85", andrew);
        students.put("emmy-90", emily);
        students.put("lizp1970", liz);

        //Display the usernames
        displayStudents(students);

        //Method to get more information on a student
        getStudentInfo(students);
    }

    //Display the usernames
    public static void displayStudents(HashMap<String, Student> username) {
        System.out.println("Welcome to your grade-book!");
        System.out.println("Here are the GitHub usernames of your students:");

        for(String key : username.keySet()) {
            System.out.printf("|%s| ", key);
        }
    }

    //Method to get more information on a student
    public static void getStudentInfo(HashMap<String, Student> students) {
        Input input = new Input();
        System.out.println();
        String userInput = input.getString("Which Student would you like to see more information on?");

        if (students.containsKey(userInput)) {
            String studentName = students.get(userInput).getName();
            double studentAverageGrade = students.get(userInput).getGradeAverage();
            System.out.println("Retrieving information...");
            System.out.printf("Name: %s - GitHub Username: %s\n", studentName, userInput);
            System.out.printf("Current Average Grade: %.2f\n", studentAverageGrade);
            boolean userConfirmation = input.yesNo("Would you like to search for another student?");
            if (userConfirmation) {
                getStudentInfo(students);
            }
        } else {
            System.out.println("Sorry, no student found with the username " + userInput);
            getStudentInfo(students);
            }

    }

}
