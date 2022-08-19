package Day44_Abstractions_InterfaceIntro.CarTask;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" twist the key to ignite the engine");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" drives toyotaly");
    }
}
