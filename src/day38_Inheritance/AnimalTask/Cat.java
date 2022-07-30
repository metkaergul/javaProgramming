package day38_Inheritance.AnimalTask;

public class Cat extends Animal{

    public Cat( String breed, int age, char gender, String size, String color) {
        super("Cat", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats cat food");;
    }

    //    Cat
//    eat(): eats cat food

}
