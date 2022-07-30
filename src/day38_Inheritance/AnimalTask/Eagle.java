package day38_Inheritance.AnimalTask;

public class Eagle extends Animal{
    public Eagle( String breed, int age, char gender, String size, String color) {
        super("Eagle", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats sneak");
    }
}
