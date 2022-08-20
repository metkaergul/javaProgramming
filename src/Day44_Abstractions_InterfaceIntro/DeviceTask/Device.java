package Day44_Abstractions_InterfaceIntro.DeviceTask;

public abstract  class Device {
    
    private final String brand,model;
    private double price;
    private String color;
    private final String size;
    private static boolean hasBattery;
    private static boolean hasPowerButton;
    static{
        
        hasBattery=true;
        hasPowerButton=true;
    }

    public Device(String brand, String model, double price, String color, String size) {
        if(brand==null||brand.isEmpty()){

            throw new RuntimeException("Invalid brand "+brand);

        }
        this.brand=brand;
        if(model==null||model.isEmpty()){

            throw new RuntimeException("Invalid model "+model);

        }
        this.model=model;
        setPrice(price);
        setColor(color);
        if(size==null||size.isEmpty()){
            throw new RuntimeException("Invalid size ");
        }
        this.size=size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if(price<=0){
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

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

    public abstract  void turnOn();
    public abstract void turnOff();

    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price

*/