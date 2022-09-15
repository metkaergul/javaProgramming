package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {
    public static void main(String[] args) {


        String str = "eeeeeaaabbbbccccdd";
        Map<String, Integer> map1 = new LinkedHashMap<>(); //keep the insertion  order


        //first I converted string to the string array
        //inserted arrays each element and its frequency into the map one by one with the help of loop
        String[] strArray = str.split("");
        for (String each : strArray) {
            int freq = Collections.frequency(Arrays.asList(strArray), each);
            map1.put(each, freq);

        }

        //--------------------------------------------------
        int highestValue = map1.get("e"); //Assuming that first pairs value is the highest
        String hasHighestFreq = "e";//assuming that first pairs key has the highest value


        for (Map.Entry<String, Integer> eachPair : map1.entrySet()) {
            int eachValue = eachPair.getValue();
            if (eachValue > highestValue) {
                highestValue = eachValue;
                hasHighestFreq = eachPair.getKey();
            }

        }
        System.out.println("character " + hasHighestFreq + " has the highest frequency: " + highestValue);


    }


}

/*Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency*/