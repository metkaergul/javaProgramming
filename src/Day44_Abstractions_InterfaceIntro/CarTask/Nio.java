package Day44_Abstractions_InterfaceIntro.CarTask;

public class Nio extends Car implements AutoPark,AutoPilot{
    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
