package day45_Abstraction.shape;

public class Rectangle extends Shape{

    private double width,length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new RuntimeException("invalid width entry "+width);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("invalid length "+length);
        }
        this.length = length;
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
                "width=" + width +
                ", length=" + length +
                super.toString()+
                '}';
    }
}
