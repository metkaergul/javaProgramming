package day38_Inheritance.ShapeTask;

public class Square extends Shape{

    public int side;


    public Square(int side) {
        super("Square");
        this.side=side;
    }



    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                " name='" + name + '\'' +
                ", side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*Square
	s

	toString(): name, s, area, perimeter*/