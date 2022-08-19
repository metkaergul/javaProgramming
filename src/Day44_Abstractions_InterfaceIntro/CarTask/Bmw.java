package Day44_Abstractions_InterfaceIntro.CarTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color) {
        super("Bmw", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" is tapping the gas pedal then twist key to ignite");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is driving bmwly");
    }
}
