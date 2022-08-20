package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps {


    public Iphone( String model, double price, String color, String size) {
        super("Iphone", model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" tornOn its own way");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" tornOff its own way");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" download its app from  the App Store");
    }
}
/*Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces
*/