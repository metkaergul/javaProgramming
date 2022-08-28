package WEEK17;


import java.util.Objects;

public class TetsEdibleClass {
    public static void main(String[] args) {

//        Object[]objects= {new Tiger(),new Chicken(),new Apple()};
//
//       // instanceof;this checks if an object belongs to a certain class ==>it returns boolean
        Tiger tiger= new Tiger();
        Chicken chicken=new Chicken();
        Apple apple= new Apple();


    }


}

interface edible{

    //describes how to eat that object
           String howToEat(); //imlpicitly public abstract

    default void someMethod(){
        System.out.println("I am from interface ,default method");
    }
    static void staticMethod(){
        System.out.println("i am from static method from interface ");
    }
}

abstract class Animal{
        //retuen animal sound
    public abstract String sound(); // we have to put abstract keyword


}
class Chicken extends Animal implements edible{


    @Override
    public String howToEat() {
        return "chicken :fry it";
    }

    @Override
    public String sound() {
        return "chicken sound:uuuuhghhuuu";
    }
}
class Tiger extends Animal {

    @Override
    public String sound() {
        return "Tiger :Roars";
    }
}
abstract class Fruit implements edible{



}
class Apple extends Fruit {


    @Override
    public String howToEat() {
        return "Make apple cider and drink";
    }
}
class Orange extends Fruit{


    @Override
    public String howToEat() {
        return "Orange :make orqange juice";
    }
//
//    @Override
//    public void someMethod(){
//
//    }

}