package day38_Inheritance.ShapeTask;

public class Rectangle extends Shape {

    public double length;
    public double width;


    public Rectangle(double length,double width) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
       return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
/*Rectangle
	l
	w

	toString(): name, l, w, area, perimeter
*/