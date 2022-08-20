package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class PersonalComputer extends Computer {

    public PersonalComputer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" turn on with its unique way");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" turn off with its unique way");
    }
}
