package day39_Recap.PhoneTask;

public class Phone {
    private String brand,model;
    private String size;
    private double price;
    private String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        if(brand.isBlank()||brand.isEmpty()){
            System.err.println("invalid brand: "+brand);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if(model.isBlank()||model.isEmpty()){
            System.err.println("invalid model: "+model);
        }
        this.model = model;
    }

    public void setSize(String size) {

        if(!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large"))){

            System.err.println("invalid size: "+size);
        }
        this.size = size;
    }

    public void setPrice(double price) {

        if(price<0){
            System.err.println("invalid price: "+price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
