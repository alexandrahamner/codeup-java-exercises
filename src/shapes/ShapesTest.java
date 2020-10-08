package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5.0,4.0);
        Rectangle box2 = new Square(5.0);

        System.out.println("Perimeter for Box 1: " + box1.getPerimeter());
        System.out.println("Area for Box 1: " + box1.getArea());
        System.out.println();
        System.out.println("Perimeter for Box 2: " + box2.getPerimeter());
        System.out.println("Area for Box 2: " + box2.getArea());

    }
}

