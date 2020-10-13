package grades;

import java.util.ArrayList;

public class Student {
    // Properties
    private final String name;
    private static ArrayList<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Student luna = new Student("Luna", grades);
        System.out.println(luna.getName());
        addGrade(87);
        addGrade(90);
        addGrade(75);
        System.out.println(getGradeAverage(grades));


    }
    // Constructor to create a student
    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public static void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public static double getGradeAverage(ArrayList<Integer> grades) {
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for(Integer grade : grades) {
                sum += grade;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }

}
