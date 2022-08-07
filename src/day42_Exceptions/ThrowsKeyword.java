package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("______ Test 1 started ______");

        System.out.println("Hello ");
        Thread.sleep(1500);
        System.out.println("World");

        System.out.println("______ Test 1 finished _______");

        System.out.println("Hello ");
        Thread.sleep(2500);
        System.out.println("Cydeo");
        System.out.println("______ Test 2 finished _______");
    }
}
