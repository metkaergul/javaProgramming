package day39_Recap.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square=new Square(3);

        System.out.println(square);
        square.setSide(10);
        System.out.println(square);

        Circle circle =new Circle(2.4);
        circle.setRadius(3);
        System.out.println(circle.getRadius());
        System.out.println(circle);


        System.out.println("___________________________________");

        Rectangle rectangle=new Rectangle(2.5,3);
        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("________________");





    }
}
