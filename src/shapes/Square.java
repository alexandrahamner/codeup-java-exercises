package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public void setLength(double n) {
        this.length = n;
    }

    @Override
    public void setWidth(double n) {
        this.width = n;
    }
}
