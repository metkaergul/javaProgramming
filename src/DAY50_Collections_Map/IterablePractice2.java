package DAY50_Collections_Map;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa",
                "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        //remove all the names "ahmed"

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            String each = it.next();
            if (each.equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("_____________________");

        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa",
                "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        //remove all the names "ahmed"



        for(Iterator<String> i = names2.iterator(); i.hasNext(); ){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }

        }
        System.out.println(names2);


        System.out.println("_________________________");

        List<String> names3 = new ArrayList<>();

        names3.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa",
                "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        //remove all the names "ahmed"

        names3.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names3);

        System.out.println("_____________________");

        Set<Integer>set= new HashSet<>(Arrays.asList(1,2,3,4,5,67,8,987,65,54,32));

        //remove even numbers from the set

        Iterator<Integer> q = set.iterator();

        while (q.hasNext()){

            if(q.next()%2==0){

                q.remove();
            }
        }

        System.out.println(set);


    }
}

