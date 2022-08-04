package day39_Recap.AnimalTask2;

public class Zoo {

    public static void main(String[] args) {

            FriendlyAnimal friendlyAnimal1= new FriendlyAnimal("Cat","Siamese",'F',2,"Small","White",false,true,true);
        System.out.println(friendlyAnimal1);
        friendlyAnimal1.play();

        WildAnimal wildAnimal1=new WildAnimal("Wolf","Cacavus",'M',3,"Large","White",true,true,false);
        wildAnimal1.hunt();
        Lion lion =new Lion("Karkas",'M',2,"Medium","Black",true,false,false);
        lion.hunt();
    }
}
/*Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
*/