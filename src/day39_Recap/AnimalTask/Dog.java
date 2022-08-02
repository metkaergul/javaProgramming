package day39_Recap.AnimalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }
    public void bark(){

        System.out.println(getBreed()+" "+getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats dog food");;
    }
}
