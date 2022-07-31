package day39_Recap.ShapeTask;

import day39_Recap.ShapeTask.Shape;

public class Square extends Shape {

    private double side;

    public Square(int side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side<=0){
            System.err.println("side of the square can not be zero or negative");
            System.exit(1);
        }
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public double perimeter() {
        return 4*side;
    }

    public String toString() {
        return "Square{" +

                "side=" + side +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
