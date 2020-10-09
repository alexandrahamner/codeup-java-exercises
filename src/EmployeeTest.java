public class EmployeeTest {
    public static void main(String[] args) {
        Employee ari = new Developer("Ari", "Web Dev" );
        Employee dan = new Developer("Dan", "Back-End");
        Employee jane = new Manager("Jane", "Web-Dev");

        System.out.println(ari.getName() + ", " + ari.getDepartment() + ", " + ari.work());
        System.out.println(dan.getName() + ", " + dan.getDepartment() + ", " + dan.work());
        System.out.println(jane.getName() + ", " + jane.getDepartment() + ", " + jane.work());

    }
}
