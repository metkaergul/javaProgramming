package day39_Recap.PhoneTask;



public class PhoneShop {
    public static void main(String[] args) {


        Samsung samsung =new Samsung("X3","SMALL",123,"white");
        Nokia nokia =new Nokia("old","small",12,"blue");
        Iphone iphone= new Iphone("13","medium",1234,"black");

        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(iphone);

        iphone.setPrice(10101);
        System.out.println(iphone.getPrice());

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println( Phone.hasBattery );
        System.out.println( Iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println(Nokia.hasBattery );
    }
}
