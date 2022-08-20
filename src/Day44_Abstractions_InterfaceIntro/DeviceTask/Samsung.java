package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{


    public Samsung( String model, double price, String color, String size) {
        super("Samsung", model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" turn on with its own way");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" with its own way");
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" download app through the android marker");
    }
}
/*2. Samsung:extends Phone class and implements Downloadable & AndroidApps interfaces*/