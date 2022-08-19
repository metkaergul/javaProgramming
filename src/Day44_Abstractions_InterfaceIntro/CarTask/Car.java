package Day44_Abstractions_InterfaceIntro.CarTask;

public abstract class Car {
    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make==null||make.isEmpty()){
            throw new RuntimeException("Invalid make "+make);
        }
        this.make = make;
        if(model==null||model.isEmpty()){
            throw new RuntimeException("Invalid model "+model);
        }
        this.model = model;
        if(year<1886){
            throw new RuntimeException("Invalid year \'it is out of market\' "+year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Invalid price "+price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color==null||color.isEmpty()){
            throw new RuntimeException("Invalid color "+color);
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public final void stop(){
        System.out.println(make+" "+model+" is breaking to the stop");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()*/