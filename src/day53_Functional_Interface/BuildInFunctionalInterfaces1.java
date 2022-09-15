package day53_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {


//        Predicate<String>isPalindrome= s -> {
//            boolean flag= false;
//            String strReverse= "";
//            for (int i = s.length()-1; i >=0 ; i--) {
//
//                strReverse+=s.charAt(i);
//            }
//            if(s.equalsIgnoreCase(strReverse)){
//                flag=true;
//            }
//
//            return flag;
//        };this is my solutionthis i

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;


        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(p -> p % 2 == 0);

        System.out.println(list);

        System.out.println("------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("----------------------------------------");

        Consumer<String>printEach=s -> {

            for (int i = 0; i <s.length() ; i++) {
                System.out.println(s.charAt(i));
            }

        };

        printEach.accept("asdertcb");

        System.out.println("----------------------------------------");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        /*
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
    */

        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });


        System.out.println("----------------------------------------");

//
//        List<String> employees = new ArrayList<>();
//        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
//                "Jilili Jiwuer", "Ali Ismayilov"));
//
//        employees.forEach(p-> {
//
//            System.out.println(
//                    p.charAt(0)+"."+p.substring(p.lastIndexOf(" ")+1,p.lastIndexOf(" ")+2)
//            );
//
//
//        });this is my solutionthis this is

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("----------------------------------------");


        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("----------------------------------------");




//            int[]arr2=new int[p.size()];
//            int count=0;
//            for (Integer each : p) {
//                arr2[count++]=each;
//            }
//
//            return arr2;
//
//        };
            Function<List<Integer>, int[]> convertToArray = (a) -> {
                int[] result = new int[a.size()];
                for (int i = 0; i < a.size(); i++) {
                    result[i] = a.get(i);
                }

                return result;
            };

        List<Integer>kl=new ArrayList<>(Arrays.asList(12,131,14,15,23,34,56));

        int[] app = convertToArray.apply(kl);
        System.out.println(Arrays.toString(app));

        System.out.println("-------------------------------------------");

        // create a function that can return the maximum number from an int array

        Function<int[], Integer> ar = (spec) -> {
            int max = Integer.MIN_VALUE;

            for (int each : spec) {
                if (each > max) {
                    max = each;
                }
            }

            return max;
        };

        int[] specArr = {1, 22, 3, 4, 5};
        Integer result = ar.apply(specArr);

        System.out.println(result);
        System.out.println("_______________________________");
        // create a function that can swap the first and last elements of an array

        Consumer<int[]> arr3 = (swap) -> {

            List<Integer> sw = new ArrayList<>();
            for (int each : swap) {
                sw.add(each);
            }

            Collections.swap(sw, 0, sw.size() - 1);
            System.out.println(sw);

        };

        int[] swapArray = {2, 5, 1, 4, 3, 7};

        arr3.accept(swapArray);

        // Create a function that can reverse an array and returns it

        Function<int[], int[]> revArr = (r) -> {

            List<Integer> revList = new ArrayList<>();
            for (int each : r) {
                revList.add(each);
            }
            Collections.reverse(revList);

            int[] rev = new int[revList.size()];

            for (int i = 0; i < rev.length; i++) {
                rev[i] = revList.get(i);
            }
            return rev;
        };

        int[] regularArr = {1, 2, 5, 7, 6, 4};
        int[] reversedArr = revArr.apply(regularArr);
        System.out.println(Arrays.toString(reversedArr));

        System.out.println("________________________________");
        // create a function that can reverse a List

        Function<List<Integer>, List<Integer>> reverseList = (z) -> {

            Collections.reverse(z);

            return z;

        };

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 45, 5));

        List<Integer> reversedList = reverseList.apply(list5);
        System.out.println(reversedList);


    }
}
