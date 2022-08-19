package Day44_Abstractions_InterfaceIntro.CarTask;

public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" can do autoparking");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" is starting with its own way");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is driving with its own way");
    }
}
