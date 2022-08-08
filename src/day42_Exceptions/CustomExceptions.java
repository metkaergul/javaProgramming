package day42_Exceptions;


class BreakException extends RuntimeException{//custom unchecked exception

    public BreakException(){
//        System.out.println("its time for break");
    }
    public BreakException(String message) {
        super(message);
    }
}
class NoBreakException extends Exception{ //custom checked exception


        }

public class CustomExceptions {

    public static void main(String[] args) {


        try{
            throw new BreakException("its time for break");
        }catch (BreakException e){
            e.printStackTrace();
        }

//        throw new NoBreakException();


    }

}
