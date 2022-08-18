package DAY43_Abstraction.ShapeTask;

public final class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double length,double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new RuntimeException("Invalid width "+width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("Invalid length "+length);
        }
        this.length = length;
    }

    @Override
    public double area() {       //this overridden method is different implementation of area method which is created in super shape class
        return width*length;
    }

    @Override
    public double perimeter() { //this overridden method is different implementation of perimeter method which is created in super shape class
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", area='" + area() + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
/*Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)*/