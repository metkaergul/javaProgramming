package DAY50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {


        Set<Integer>set1= new HashSet<>();
        set1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set1);

       List<Integer>list= new ArrayList<>( set1);//in the arraylist constructor we can convert set collection data type
        //to the arraylist

        System.out.println(list.get(3));

        System.out.println("_________________________");

        //pop

        List<Character> chars= new Stack<>();

        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println(chars);

        ((Stack)chars).pop();


        System.out.println("after pop method [LIFO] = "+chars);


        System.out.println("____________________________________");

        List <String>names=new LinkedList<>();

        names.addAll(Arrays.asList("Jimmy","Johny","mike","Zelina","Sabur"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println("after poll()method[FIFO] = "+names);

        ((LinkedList<String>) names).poll();

        System.out.println("after one more poll()method[FIFO] = "+names);


    }
}
