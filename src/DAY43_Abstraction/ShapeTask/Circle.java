package DAY43_Abstraction.ShapeTask;

public final class Circle extends Shape{

    private double radius;
    public  static double pi;

    static {
        pi=3.14;
    }
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius entry "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
/*	Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi*/