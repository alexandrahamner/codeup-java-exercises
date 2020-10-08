package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
    //To make sure the square methods are being called on.
        System.out.println("Using the square method.");
        return Math.pow(this.length, 2);
    }

    public double getPerimeter(){
    //To make sure the square methods are being called on.
        System.out.println("Using the square method.");
        return this.length * 4;
    }

}
