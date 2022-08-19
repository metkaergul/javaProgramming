package DAY43_Abstraction.AnimalTask;

public class Cat extends Animal{


    public Cat( String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats biryani");
    }
}
/*Cat
eat(): eats Biryani*/