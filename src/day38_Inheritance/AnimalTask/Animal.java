package day38_Inheritance.AnimalTask;

public class Animal {
    public String name,breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){

        System.out.println(breed+" "+name+" eats");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*Animal Task:
	1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()

	2. Create the followin sub classes of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

			2. Dog
					eat(): eats dog food

			3. Tiger
					eat(): eats deer

			4. Eagle
					eat(): eats snake
					*/