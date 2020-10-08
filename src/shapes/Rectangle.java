package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double userLength, double userWidth) {
        this.length = userLength;
        this.width = userWidth;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}
