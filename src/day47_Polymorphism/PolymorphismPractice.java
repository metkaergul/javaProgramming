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

        for (Car each : cars) {

           if(each instanceof Toyota){

               if(each.year>=2010&&each.year<=2011){

                   System.out.println(each);
               }
               }
           if(each instanceof Tesla){

               if(each.year>=2015&&each.year<=2016){

                   System.out.println(each);
               }
           }
           if(each instanceof Bmw){
               System.out.println(each);
           }

           }

        System.out.println("______________________________________");

        Car hasHighestMileage=cars[0];//assuming that first stored element in the Car class has the highest mileage

        for (Car each : cars) {
            if (each.miles > hasHighestMileage.miles) {
                hasHighestMileage = each;

            }

        }
        System.out.println(hasHighestMileage.brand + " " + hasHighestMileage.model + " has the highest mileage: " + hasHighestMileage.miles);

        Car hasLowestMileage=cars[0];//assuming that first stored element in the Car class has the lowest mileage
            for (Car each : cars) {
            if(each.miles<hasLowestMileage.miles){
                hasLowestMileage=each;

            }
        }
        System.out.println(hasLowestMileage.brand+" "+hasLowestMileage.model+" has the lowest mileage: "+hasLowestMileage.miles);



    }

    }

/*
	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage


*/