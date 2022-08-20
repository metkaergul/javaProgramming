package Day44_Abstractions_InterfaceIntro.DeviceTask;

public class PhoneShop {
    public static void main(String[] args) {


        Iphone iphone=new Iphone("iphone 13",987,"White","Medium");
        Samsung samsung=new Samsung("leo",345,"Gray","Small");
        Desktop desktop=new Desktop("Philips","Abc34",12.000,"Black","Big");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(desktop);

        iphone.downloadApp();
        iphone.turnOff();
        samsung.downloadApp();
        System.out.println(AndroidApps.OS);


    }


}
/*Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes


*/