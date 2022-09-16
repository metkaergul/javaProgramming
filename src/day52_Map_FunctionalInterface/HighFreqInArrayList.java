package day52_Map_FunctionalInterface;

import java.util.*;

public class HighFreqInArrayList {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "java", "python","python","python", "c#"));


        Map<String, Integer> map2 = new LinkedHashMap<>();// if preserving insertion order matters then it is safe to use it

        //inserted each arraylist element into the map and since it does not accept duplication duplicated "java" will be removed
        for (String each : list) {
            int freq = Collections.frequency(list, each);
            map2.put(each, freq);
        }

        int highestFreq = Integer.MIN_VALUE;
        String hasHighestFreq = "";

        for (Map.Entry<String, Integer> eachPair : map2.entrySet()) { //the reason why I use entrySet()method is that it allows us to manipulate both key and values

            int eachValue = eachPair.getValue();
            if (eachValue > highestFreq) {
                highestFreq = eachValue;
                hasHighestFreq = eachPair.getKey();
            }
        }

        System.out.println(" element " + hasHighestFreq + " has the highest frequency: " + highestFreq);

    }
}

/*
	Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency

*/