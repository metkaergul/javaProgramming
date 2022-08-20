package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class Google extends Phone implements Downloadable,AndroidApps {


    public Google(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" turn on with its own way");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" turn off with its unique way");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" dowload app via its own market");
    }
}
/*Google:			extends Phone class and implements Downloadable & AndroidApps interfaces*/