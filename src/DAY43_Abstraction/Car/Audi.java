package DAY43_Abstraction.Car;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has an auto Park feature");

    }


}
