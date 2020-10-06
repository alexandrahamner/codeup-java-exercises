package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius of the circle? (Can include decimals)");
        double userRadius = sc.nextDouble();
        Circle circle1 = new Circle(userRadius);
        double userArea= circle1.getArea();
        double userCircumference = circle1.getCircumference();
        System.out.printf("Radius: %s \nArea: %s \nCircumference: %s", userRadius, userArea, userCircumference);
    }

    public static void main(String[] args) {
        getRadius();
    }
}
