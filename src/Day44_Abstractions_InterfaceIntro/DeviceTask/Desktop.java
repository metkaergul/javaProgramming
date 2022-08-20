package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class Desktop extends Computer{

    public Desktop(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" turn on the device with its own way");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" turn off the device with its own way");
    }
}
