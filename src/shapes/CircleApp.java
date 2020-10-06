package shapes;

import util.Input;

public class CircleApp {

    public static void getRadius() {
        Input Circle = new Input();
        double userRadius = Circle.getDouble();
        Circle circle1 = new Circle(userRadius);
        double userArea= circle1.getArea();
        double userCircumference = circle1.getCircumference();
        System.out.printf("Radius: %s \nArea: %s \nCircumference: %s", userRadius, userArea, userCircumference);
    }

    public static void main(String[] args) {
        getRadius();
    }
}
