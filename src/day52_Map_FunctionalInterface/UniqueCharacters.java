package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "aabcccdeeeef";
//find the unique characters from the given string
//output {b=1,d=1,f=1}
        System.out.println("__________________this is my solution it is a little bit old harder way but it is good to remember");
        Map<String, Integer> map1 = new LinkedHashMap<>();
        String[] array = str.split("");

        for (String each : array) {
            int count = 0;
            for (String eachInner : array) {
                if (each.equals(eachInner)) {
                    count++;
                }

            }
            if (count > 1) {
                continue;

            } else {
                map1.put(each, count);
            }
        }
        System.out.println(map1);

        System.out.println("------------------second solution---------------");

        Map<String, Integer> map2 = new LinkedHashMap<>();//the reason why we prefer using linkedHASHMAP is that it keeps the insertion order
        String[] array2 = str.split("");

        for (String each : array2) {
            int freq = Collections.frequency(Arrays.asList(array2), each);
            if (freq == 1) {
                map2.put(each, freq);
            }
        }
        System.out.println(map2);

    }
}
