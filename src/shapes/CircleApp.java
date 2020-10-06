package shapes;

import util.Input;

public class CircleApp {

    public static void getRadius() {
        boolean userConfirmation = true;
        do {
            Input Circle = new Input();
            double userRadius = Circle.getDouble();
            Circle circle1 = new Circle(userRadius);
            double userArea = circle1.getArea();
            double userCircumference = circle1.getCircumference();
            System.out.printf("Radius: %s \nArea: %s \nCircumference: %s\n", userRadius, userArea, userCircumference);
            userConfirmation = Circle.yesNo();
        } while (userConfirmation);

    }

    public static void main(String[] args) {
        getRadius();
    }
}
