package day53_Functional_Interface;

public class LambdaExpressions {
    public static void main(String[] args) {


        MyThirdFunctionalInterface<String> reverse= (s) ->{
String rev= "";
            for (int i =s.length()-1; i >=0 ; i--) {
                rev+=s.charAt(i);
            }
            return rev;
        };

        String r=reverse.method("levrek");
        System.out.println(r);

        //create a function that can return a cube of a given integer

        MyThirdFunctionalInterface<Integer>cube=i-> i*i*i;

        Integer result = cube.method(2);
        System.out.println(
                result
        );


    }
}
