package day46_Polymorphism;

import day38_Inheritance.CarWarmUpTask.Bmw;
import day38_Inheritance.CarWarmUpTask.Car;
import day38_Inheritance.CarWarmUpTask.Tesla;
import day38_Inheritance.CarWarmUpTask.Toyota;

public class CarObjectsTask {
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


        for (Car eachCar : cars) {
            if (eachCar instanceof Bmw) {
                if (eachCar.year >= 1929 && eachCar.year <= 2022) {
                    System.out.println(eachCar.model + " is eligible for recall");
                }
            }
            if (eachCar instanceof Toyota) {
                if (eachCar.year >= 2010 && eachCar.year <= 2011) {
                    System.out.println(eachCar.model + " is eligible for recall");
                }
            }
            if (eachCar instanceof Tesla) {
                if (eachCar.year >= 2015 && eachCar.year <= 2016) {
                    System.out.println(eachCar.model + " is eligible for recall");
                }
            }

        }
        System.out.println("_________________________________________________");

        double highestMileage = cars[0].miles;
        int temp = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].miles > highestMileage) {
                highestMileage = cars[i].miles;
                temp = i;
            }
        }
        System.out.println(cars[temp].model + " has the highest mileage : " + highestMileage);
        System.out.println("______________________________________________");
        double lowestMileage = cars[0].miles;
        int temp2 = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].miles < lowestMileage) {
                lowestMileage = cars[i].miles;
                temp2 = i;
            }
        }
        System.out.println(cars[temp2].model + " has the lowest mileage : " + lowestMileage);


    }


}

/*Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };

		        (import them from day38 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage


*/