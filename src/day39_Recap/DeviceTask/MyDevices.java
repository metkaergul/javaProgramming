package day39_Recap.DeviceTask;

public class MyDevices {

    public static void main(String[] args) {


        Phone phone=new Phone("Nokia","x3",23);
        System.out.println(phone);
        System.out.println(phone.getBrand());

        phone.setBrand("shami");
        System.out.println(phone);

        System.out.println("______________________");

        PC pc1=new PC("philips","A3",352);
        System.out.println(pc1);
        pc1.turnOn();


    }
}
