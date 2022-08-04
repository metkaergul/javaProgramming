package day39_Recap.DeviceTask;

public class Iphone extends Phone{

    public Iphone( String model, double price) {
        super("Iphone", model, price);
    }

    public void faceTime(long phoneNumber){

        System.out.println(getBrand()+" faceTime with "+phoneNumber);
    }
}
/*Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia*/