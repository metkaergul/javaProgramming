package day39_Recap.AnimalTask2;

public class Dog extends FriendlyAnimal{

    public Dog( String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dog", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating dog food");;
    }

    public void bark(){

        System.out.println(getBreed()+" "+getName()+" is barking");
    }
}
/*Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
*/