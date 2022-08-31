package day47_Polymorphism;

import day38_Inheritance.CarWarmUpTask.Bmw;
import day38_Inheritance.CarWarmUpTask.Car;
import day38_Inheritance.CarWarmUpTask.Tesla;
import day38_Inheritance.CarWarmUpTask.Toyota;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Car[] cars = {new Toyota("Highlander", 2010, 25000, "White", 255000),
                new Bmw("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new Bmw("M3", 2015, 33000, "Blue", 14030),
                new Bmw("M5", 2017, 35000, "Black", 15000),
                new Bmw("M4", 2018, 40000, "White", 19000),
                new Bmw("7 Series", 2009, 30000, "Purple", 21000),
                new Bmw("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000)};

    }
}
