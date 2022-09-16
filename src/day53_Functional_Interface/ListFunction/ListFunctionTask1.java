package day53_Functional_Interface.ListFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctionTask1 {

    public static void main(String[] args) {

       // Create a function that can return the maximum number from a list of Integer
        ListFunction<List<Integer>,Integer> maxNumber=(l)->{

            int max= Integer.MIN_VALUE;
            for (Integer each : l) {

                if(each>max){
                    max=each;
                }
            }
            return max;
        };
        List<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer resultMax = maxNumber.apply(list);
        System.out.println(resultMax);

        System.out.println("_____________________________");

        // Create a function that can return the longest String from a List of String

        ListFunction<List<String>,String>longestString=(s)->{

            int lengthOfLongestString=0;
            String longest= "";
            for (String each : s) {
                int eachLength= each.length();
                if(eachLength>lengthOfLongestString){
                    lengthOfLongestString=eachLength;
                    longest=each;
                }
            }


            return longest;

        };

        List<String>names=new ArrayList<>(Arrays.asList("Ahmet","Yakup","Serdar","Okan","Melih Rustu"));
        String result = longestString.apply(names);
        System.out.println(result);


        System.out.println("______________________________________");

        //Create a function that can convert List of integer to int array
        ListFunction<List<Integer>,int[]>convertToArray=(p)->{

            int[]array= new int[p.size()];

            for (int i = 0; i <p.size() ; i++) {
                array[i]=p.get(i);
            }

            return array;
        };

        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));
        int[] convertedResult = convertToArray.apply(list2);
        System.out.println(Arrays.toString(convertedResult));

    }


}
/*	1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array
*/