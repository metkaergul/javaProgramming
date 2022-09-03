package Quizzes;

public class assesmett3 {


    public static void main(String[] args) {
                method3(50);
    }

    public static String method3(int num){

        if(num<0){
            return "less than 0";

        } else if (num<50) {

            return "less than 50";
        } else if (num<100) {
            return "less than 100";
        }else{
            return "other";
        }

    }


}
