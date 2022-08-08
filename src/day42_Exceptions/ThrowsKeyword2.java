package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println("TEST STARTED");
        System.out.println(100/0);
        System.out.println("TEST COMPLETED");

        //throws keyword can not handle the unchecked exceptions only temporarily handle the checked exceptions

    }
}
