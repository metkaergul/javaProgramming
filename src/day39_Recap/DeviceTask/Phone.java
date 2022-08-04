package day39_Recap.DeviceTask;

public class Phone extends Device{


    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }
    public void call(long phoneNum){

        System.out.println(getBrand()+" "+getModel()+"can call"+phoneNum);
    }
    public void text(long phoneNum){

        System.out.println(getBrand()+" "+getModel()+"can text to"+phoneNum);
    }



}
/*Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)*/