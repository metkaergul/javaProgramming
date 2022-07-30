package day38_Inheritance.AnimalTask;

public class Dog extends Animal{
    public Dog( String breed, int age, char gender, String size, String color) {
        super("Dog", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats dog food");;
    }
}
