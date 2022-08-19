package Day44_Abstractions_InterfaceIntro.CarTask;

public class CarShop {
    public static void main(String[] args) {

        CydeoCar cydeoCar=new CydeoCar("FutureX",2023,89.000,"Sky-Blue");
        Toyota toyota=new Toyota("Corolla",2014,56.000,"White");
        Honda honda =new Honda("Jazz",2019,34.000,"Black");
        Bmw bmw=new Bmw("x3",2019,46.000,"Blue");
        System.out.println(cydeoCar);
        cydeoCar.autoPark();
        cydeoCar.fly();


    }
}
/*Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects*/