package DAY43_Abstraction.AnimalTask;

public final class Eagle extends Animal implements WildAnimal,Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 50km/h");
    }

    @Override
    public void hunt() {

    }
}
