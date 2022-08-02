package day39_Recap.AnimalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats cat food");;
    }


}
