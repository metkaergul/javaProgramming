package day53_Functional_Interface.BiPredicateFunction;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Practice {
    public static void main(String[] args) {

//Create a function that can check if two array are equal and contains the same elemnts
        BiPredicate<int[],int[]>equal=(f,s)->{

            Arrays.sort(f);
            Arrays.sort(s);

           return Arrays.equals(f,s);


        };
        int[]arr1 = {3,2,1};
        int[]arr2 = {2,1,3};

        boolean isEqual = equal.test(arr1, arr2);
        System.out.println(isEqual);

        System.out.println("_____________________________");

      //  Create a function that can check if the first array contains all the elemnts of the second array:

//        BiPredicate<int[],int[]>contains=(n,m)->{
//
//
//
//
//        };
//
//        int[]arr3 = {1,2,3,4,5,6};
//        int[]arr4 = {4,5,6};
//        boolean test = contains.test(arr3, arr4);
//        System.out.println(test);





    }
}
/* Use BiPredicate functional interface to:
		5.1 Create a function that can check if two array are equal and contains the same elemnts
				ex: arr1 = {3,2,1}
					arr2 = {2,1,3}

				output: true

		5.2 Create a function that can check if the first array contains all the elemnts of the second array:
				ex: arr1 = {1,2,3,4,5,6}
					arr2 = {7,8}

				output: false

		5.3 Create a function that can check if two List of Integers are equal and contains the same elemnts
				ex: list1 = {3,2,1}
					list2 = {2,1,3}

				output: true

		5.4 Create a function that can check if the first List contains all the elemnts of the second List:
				ex: list1 = {1,2,3,4,5,6}
					list2 = {7,8}

				output: false*/