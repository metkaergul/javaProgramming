package day53_Functional_Interface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

       //create a function that can check iF The Integer is contained in an array of Integer


        BiPredicate<int[],Integer>contains=(arr,num)->{

            boolean result= false;
            for (int each : arr) {

                if(each==num){
                    result= true;
                    break;
                }
            }
            return result;
        };
            int[]arr={1,2,3,4,4,5,5,6,8};
        boolean test = contains.test(arr, 5);
        System.out.println(test);
        System.out.println("______________________");
        //create a function that can check if two strings are anagram


        //                              a= bac,   b= cab
        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split(""); //[b, a, c]
            String[] arr2 = b.split(""); //[c, a, b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        boolean anag = anagram.test("melih", "himel");
        System.out.println(anag);

        System.out.println("---------------------------------------------");
        //Create a function that print given string for given number of times

        BiConsumer<String,Integer>printGivenTimes=(s,i)->{

            for (int j = 0; j <i ; j++) {

                System.out.println(s);

            }

        };
        printGivenTimes.accept("Wooden Spoon",14);
        System.out.println("_____________________________________");

             //create a function that takes first and last names and print formatted format
            //   "JaVa","programming"========>"Java Programming"

            BiConsumer<String,String>format= (k,l)->{

            String fullFormattedName= "";
            fullFormattedName+=k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase();
            fullFormattedName+=" "+l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();

            System.out.println(fullFormattedName);

        };
            format.accept("JaVA","PROgramming");

        System.out.println("________________________");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : "+v);
        }
         */

        scrumTeam1.forEach(  (k, v) -> System.out.println(k+" : "+v) );


        System.out.println("---------------------------------------------");

        //1. create a function that takes two integers and returns the maximum integer

//        BiFunction<Integer,Integer,Integer>maxInteger= (a,b)->{
//
//            if(a>b){
//                return a;
//            }else{
//                return b;
//            }
//        };
//
//        Integer maxInt = maxInteger.apply(12, 34);
//        System.out.println(maxInt);
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b)?a:b;

        int max = maxNum.apply(100, 200);

        System.out.println(max);

        System.out.println("___________________________________");
        //2. create a function that can merge two integer arrays into a list
                BiFunction<int[],int[],List<Integer>>merge=(b,n)->{


                    List<Integer>merged= new ArrayList<>();

                    for (int each : b) {
                        merged.add(each);
                    }
                    for (int each : n) {
                        merged.add(each);
                    }

                    return merged;
                };

                int[]arr4={1,2,3,4};
                int[]arr5={5,6,7,8};

        List<Integer> mergedList = merge.apply(arr4, arr5);
        System.out.println(mergedList);


        System.out.println("______________________");


        BiFunction<List<String>,List<Integer>,Map<String,Integer>>mapList=(a,b)->{

            Map<String,Integer>combinePair=new HashMap<>();

            for (int i = 0; i <a.size() ; i++) {
                combinePair.put(a.get(i),b.get(i));
            }
            return combinePair;
        };

        List<String>names=new ArrayList<>(Arrays.asList("samet","mahmut"));
        List<Integer>numbers=new ArrayList<>(Arrays.asList(12,25));

        Map<String, Integer> combined = mapList.apply(names, numbers);

        System.out.println(combined);

    }
}
