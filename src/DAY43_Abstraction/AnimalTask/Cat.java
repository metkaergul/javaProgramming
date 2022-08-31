package DAY43_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable{


    public Cat( String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats biryani");
    }

    public void play(){
    }

    public void meow(){


    }
}
/*Cat
eat(): eats Biryani*/