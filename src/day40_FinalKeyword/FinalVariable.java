package day40_FinalKeyword;

public class FinalVariable {
    final String birthDay;

    final static String name;

    static {

        name="Cydeo";
    }

    public FinalVariable(String birthDay){
        this.birthDay=birthDay;
    }


    public static void main(String[] args) {

        final double PI;
        PI=3.14;

        final String name;
        name="Java";

        //name="Wooden Spoon";

        System.out.println(name);

        System.out.println("______________________________");

        FinalVariable obj= new FinalVariable("may/01");

       // obj.birthDay="may.02";//final variables can not be reassigned

        System.out.println(FinalVariable.name);
       // FinalVariable.name="Cybertek";//we can never reassigned final variable

    }

}
