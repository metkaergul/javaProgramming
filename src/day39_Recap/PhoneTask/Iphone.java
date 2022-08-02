package day39_Recap.PhoneTask;

public class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Iphone", model, size, price, color);
    }

    public void faceTime(long phoneNumber){

        System.out.println(getBrand()+" "+getModel()+" is having faceTime with "+phoneNumber);
    }
    public void faceTime(String email){

        System.out.println(getBrand()+" "+getModel()+" is having faceTime with "+email);
    }


}
