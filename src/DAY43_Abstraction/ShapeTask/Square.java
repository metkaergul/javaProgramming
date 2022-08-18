package DAY43_Abstraction.ShapeTask;

public final class Square extends Shape{

        private double  side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side entry "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() + '\'' +
                ", side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
/*	Square:
					area(): s * s
					perimeter: 4 * s*/