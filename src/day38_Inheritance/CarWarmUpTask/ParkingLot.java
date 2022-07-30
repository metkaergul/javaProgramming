package day38_Inheritance.CarWarmUpTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota=new Toyota("Camry",2020,20000,"Gray",123456);

        Tesla tesla= new Tesla("Model S",2022,94990,"Red",0);
        //has a relationship betwween parking lot class and tesla and toyota class
toyota.start();
tesla.start();

    }
}
