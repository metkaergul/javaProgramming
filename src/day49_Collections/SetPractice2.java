package day49_Collections;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {


        String []arr= {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke","Paper towels"};

        arr=new LinkedHashSet<String>(Arrays.asList(arr)).toArray(new String [0]);

//
//        Set<String>set1= new HashSet<>(Arrays.asList(arr));
//        System.out.println("set1 = " + set1);
//
//        arr=set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));


        ArrayList<Integer>list =new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,600,600,10,10,20,30,40,30,20,10));

        list=new ArrayList<>( new LinkedHashSet<>(list) );

        System.out.println("__________________________");
        String str = "eeeeeaaaabbbbccccdddeeeee";

        //  eabcd
        //  54434

        String result = ""; //e5a4b4c4d3


        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

           int count=  Collections.frequency(Arrays.asList(str.split("")),each);

           result+=each+count;

        }
        System.out.println(result);


        System.out.println("____________________________");

        Integer[]nums={1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

//       List<Integer>listOfInteger= new ArrayList<>( new LinkedHashSet<Integer>(Arrays.asList(nums)));
//        System.out.println("listOfInteger.get(4) = " + listOfInteger.get(4));

         nums= new LinkedHashSet<Integer>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));
        System.out.println("fifth element of the array= " + nums[4]);

        System.out.println("_____________________________________________________");

        Set<String>names=new LinkedHashSet<>(Arrays.asList("Ahmet","Mahmut","Safiye","Ahmet","seker"));

//        System.out.println(new ArrayList<String>(Arrays.asList(names.toArray(new String[0]))).get(3));

//        System.out.println(names.toArray()[2]);

        System.out.println(new ArrayList<>(names).get(2));

    }

}
