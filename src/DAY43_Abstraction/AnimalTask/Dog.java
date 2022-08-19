package DAY43_Abstraction.AnimalTask;

public final class Dog extends Animal{


    public Dog( String breed, char gender, int age, String size, String color) {
        super("Dog", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats pizza");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
/*Dog
eat(): eats Pizza
*/