package day38_Inheritance.CarWarmUpTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, double miles) {
        super("Bmw", model, year, price, color, miles);
    }
    public void breaksDown(){

        System.out.println(brand+" breaks down");
    }
    public void racing(){

        System.out.println(brand+" have racing models");
    }
}
