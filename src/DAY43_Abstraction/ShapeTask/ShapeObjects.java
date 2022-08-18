package DAY43_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

       // Shape shape=new Shape();      //'Shape' is abstract; cannot be instantiated

        Circle circle=new Circle(2.4);
        Square square=new Square(3.4);
        Rectangle rectangle=new Rectangle(2,6);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);




    }
}
