package Day44_Abstractions_InterfaceIntro.CarTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" have an autoPark feature");
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

    @Override
    public void fly() {
        System.out.println(getMake()+" can fly through the sky smoothly");
    }
}
