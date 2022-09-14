package day52_Map_FunctionalInterface;

//lambda () -> {}

public class Test {
    public static void main(String[] args) {


        //function1:create a function that can display a number is odd

        MyFirstFunctionalInterface oddOrEvenNumber= (number) -> {
            if(number%2==0){
                System.out.println(number+" is even number ");

        }else{
                System.out.println(number+" is odd number");
            }

        };
        oddOrEvenNumber.apply(34);
        //function2:create a function that can check if a person is eligible

        MyFirstFunctionalInterface isEligible=(age)->{

            if(age>18){
                System.out.println("person that "+age+" is eligible");
            }else{
                System.out.println("person that "+age+" is not eligible");
            }

        };
        isEligible.apply(17);
        //function3:create a function that can display a cube a number

        MyFirstFunctionalInterface printCube= (number)->{
            System.out.println(number*number*number);

        };


        printCube.apply(12);

        //write a program that  it can give the number that divisible by 3 and 5 both

        MyFirstFunctionalInterface divisibleBy3And5=(number)->{

            if(number%15==0){
                System.out.println(number+" is divisible by 3 and 5 both");
            }else{
                System.out.println(number+" is not divisible by 3 and 5 both");
            }

        };
        divisibleBy3And5.apply(45);

    }
}
