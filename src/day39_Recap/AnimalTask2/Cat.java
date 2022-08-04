package day39_Recap.AnimalTask2;

public class Cat extends FriendlyAnimal{
    public Cat( String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }


    public void scratch(){
        System.out.println(getBreed()+" "+getName()+" scratches");
    }
    public void meow(){
        System.out.println(getBreed()+" "+getName()+" meows");
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating cat food");;
    }
}
