package day39_Recap.AnimalTask;



public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog =new Dog("Alex", "Husky", 'M',"small",1,"White");

        dog.bark();
        dog.eat();
        dog.move();
       Cat cat = new Cat("Love", "Siamese",'F',"big",2,"Black");

       cat.scratch();
       cat.eat();
    }
}
