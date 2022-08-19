package Day44_Abstractions_InterfaceIntro.CarTask;

public class Honda extends Car{
    public Honda( String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" is double twisting the key to ignite ");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is driving hondaly");
    }
}
