package day38_Inheritance.ShapeTask;

public class Circle extends Shape{

    public double radius;
    public static double  pi=3.14;

    public Circle(double radius) {
        super("circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
*/