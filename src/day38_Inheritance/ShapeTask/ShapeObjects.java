package day38_Inheritance.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle= new Circle(2.5);

        System.out.println(circle);

        Square square=new Square(4);

        System.out.println(square);

        Rectangle rectangle=new Rectangle(2.4,6);

        System.out.println(rectangle);

        double rectArea=rectangle.area();
        System.out.println(rectArea);



    }
}
