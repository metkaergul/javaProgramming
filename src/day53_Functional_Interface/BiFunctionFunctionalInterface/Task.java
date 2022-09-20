package day53_Functional_Interface.BiFunctionFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Task {

    public static void main(String[] args) {

        //   6.1 Create a fucntion that can returns the common characters of two strings
        //  ex: str1 = "Python"
        //   str2 = "Wooden Spoon"

        // output: on

        BiFunction<String, String, String> common = (f, s) -> {

            String commonCharacters = "";

            String[] arr1 = f.split("");
            String[] arr2 = s.split("");

            for (String eachOuter : arr1) {
                for (String eachInner : arr2) {
                    if (eachOuter.equals(eachInner)) {

                        commonCharacters += eachOuter;

                    }
                }
            }
            return commonCharacters;

        };

        String name1 = "tufan";
        String name2 = "Turan";

        String result = common.apply(name1, name2);

        System.out.println("result = " + result);

        System.out.println("_______________________________");


        //Create a function that can return the common elements of two integer arrays
        BiFunction<int[], int[], String> commonInArray = (a1, a2) -> {

            String c = "";

            for (int eachOuter : a1) {
                for (int eachInner : a2) {
                    if (eachOuter == eachInner) {

                        c +=  eachOuter+" ";
                    }
                }
            }

            return c;
        };
        int[]arr1={1,2,3,4};
        int[]arr2={3,1,5,6};
        String result2 = commonInArray.apply(arr1, arr2);
        System.out.println("result2 = " + result2);

        System.out.println("__________________________");
        //Create a function that can return the common elements of two String arrays

        BiFunction<String[],String[],String>commonInStringArray=(d,f)->{
String com= "";
            for (String each1 : d) {
                for (String each2 : f) {
                    if(each1.equals(each2)){
                        com+=each1+" ";
                    }
                }
            }
            return com;
        };
            String[]s1={"mahmut","java","python","asya"};
            String[]s2={"mahmut","java","pytho","sya"};
        String output = commonInStringArray.apply(s1, s2);
        System.out.println("output = " + output);

        System.out.println("________________________");

        BiFunction<List<Integer>,List<Integer>,List<Integer>>commonInList=(z,x)->{
List<Integer>commonIntegerInList=new ArrayList<>();


            for (Integer each : z) {
                for (Integer eachInner : x) {
                    if(each==eachInner){

                        commonIntegerInList.add(each);
                    }
                }
            }




          return commonIntegerInList;
        };

        List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer>lis2=new ArrayList<>(Arrays.asList(4,5,6,7,8));

        List<Integer> outcome = commonInList.apply(list1, lis2);
        System.out.println("outcome = " + outcome);

    }
}
/*
    Use BiFunction functional interface to:
            6.1 Create a fucntion that can returns the common characters of two strings
    ex: str1 = "Python"
    str2 = "Wooden Spoon"

    output: on

		6.2 Create a function that can return the common elements of two integer arrays

		6.3 Create a function that can return the common elements of two String arrays

		6.4 Create a function that can return the common elements of two Lists of Integers

		6.5 Create a function that can return the common elements of two Lists of Strings
*/