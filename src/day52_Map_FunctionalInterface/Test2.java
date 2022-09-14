package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String>printEach;
        printEach=(name)->{

            System.out.println(name);

        };
        printEach.test("mahmit");


    }

}
