package day51_Map;

import java.util.*;

public class MapPractices4 {
    public static void main(String[] args) {

            /*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
    */

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


            Map<Integer,ArrayList<String>>students= new TreeMap<>();

            students.put(1,group1);
            students.put(2,group2);
            students.put(9,group9);
            students.put(24,group24);
            students.put(5,group5);

        System.out.println(students);

        for (String each : students.get(9)) {
            System.out.println(each);
        }

        System.out.println(students.get(2).get(1));

        System.out.println("______________________");

       //how to retrieve all the names from all the groups
//
//        for (Map.Entry<Integer, ArrayList<String>> eachPair : students.entrySet()) {
//
//            int sizeOfEachgroup = eachPair.getValue().size();
//            for (int i = 0; i < sizeOfEachgroup; i++) {
//
//                System.out.println(eachPair.getValue().get(i));
//            }
//
//        }

        for (ArrayList<String> eachGroup : students.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }
        }



    }
}
