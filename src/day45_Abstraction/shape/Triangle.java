package day45_Abstraction.shape;

public class Triangle extends Shape{

    private double height;
    private double base;
    private double side1;
    private double side2;

    public Triangle(String name, double height, double base, double side1, double side2) {
        super(name);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new RuntimeException("invalid height "+height);
        }
        this.height = height;
    }

    public void setBase(double base) {
        if(base<=0){
            throw new RuntimeException("invalid base "+base);
        }
        this.base = base;
    }

    public void setSide1(double side1) {
        if(side1<=0){
            throw new RuntimeException("invalid side1 "+side1);
        }
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        if(side2<=0){
            throw new RuntimeException("invalid side2 "+side2);
        }
        this.side2 = side2;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }

    @Override
    public double perimeter() {
        return base+side1+side2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                "height=" + height +
                ", base=" + base +
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
