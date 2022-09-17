package day53_Functional_Interface.FunctionBuildInFunctionalInterface;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        //Create a function that can return the sum of digits from a string
        Function<String,Integer>sumOfDigits=(s)->{

            int sum=0;

            char[]array=s.toCharArray();
            for (char each : array) {
              if(  Character.isDigit(each)){

                  sum+=Integer.parseInt(String.valueOf(each));
              }
            }

           return sum;
        };

        String name="Mahmut112234";
        Integer result = sumOfDigits.apply(name);
        System.out.println(result);

        System.out.println("_________________________");

        //Create a function that can convert a Set of Integers to List of Integers

        Function<Set<Integer>, List<Integer>>convertToList=(s)->{

            List<Integer>list= new ArrayList<>();
            for (Integer each : s) {
                list.add(each);
            }
        return list;

        };

        Set<Integer>set1=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> listresult = convertToList.apply(set1);
        System.out.println(listresult);

        System.out.println("___________________________");
        //Create a function that can return the reversed version of an int array

        Function<int[],int[]>reversedArray=(r)->{

            int[]reversedArr= new int[r.length];
           int j=0;
            for (int i = r.length-1; i >=0 ; i--) {
                reversedArr[i]=r[j++];
            }
           /* int[]reversedArr= new int[r.length];
            List<Integer>list1=new ArrayList<>();
            for (int each : r) {
                list1.add(each);
            }
            Collections.reverse(list1);
            for (int i = 0; i <reversedArr.length ; i++) {
                reversedArr[i]=list1.get(i);
            }*/

return reversedArr;
        };

        int[]arr={1,2,3,6,54,7};
        int[] reversedResult = reversedArray.apply(arr);
        System.out.println(Arrays.toString(reversedResult));

        System.out.println("_____________________________________");
        // Create a function that can return the sorted (ascending) version of an int array

        Function<int[],int[]>sorted=(s)->{


            Arrays.sort(s);

            return s;

        };

        int[]sorte={9,8,5,4,6};
        int[] sortedVersion = sorted.apply(sorte);
        System.out.println(Arrays.toString(sortedVersion));

        System.out.println("_________________________________________");
        // Create a function that can return the sorted (ascending) version of an int array

        Function<int[],int[]>sortDescending=(s)-> {
            int[]descendingArr=new int[s.length];
            Arrays.sort(s);

            int j=0;
            for (int i = descendingArr.length-1; i >=0 ; i--) {
                descendingArr[i]=s[j++];
            }

          return descendingArr;
        };

        int[]arr2={0,9,5,7,6,9,2,5,6};
        int[] descendingOrder = sortDescending.apply(arr2);
        System.out.println(Arrays.toString(descendingOrder));

    }
}
/* Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (decending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (decending) version of a String array
				Note: you can use the reverse function you created at 4.5
*/