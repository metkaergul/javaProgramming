package DAY50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i)<4){
                list.remove(i);

            }

        }

        System.out.println(list);

        System.out.println("______________________");

        // this is how to remove element from the collection before lambda expression was introduced

        List<Integer>list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();

        /*
        boolean r1 = it.hasNext();
        System.out.println(r1);
        System.out.println(it.next());
        boolean r2 = it.hasNext();
        System.out.println(r2);
        System.out.println(it.next());
    */


        while (it.hasNext()){

           Integer each= it.next();

           if(each<4){
               it.remove();
           }


        }
        System.out.println(list2);

        System.out.println("________________________");

        // this is how to remove element from the collection before lambda expression was introduced
        List<Integer>list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> iter = list3.iterator();

        for (Iterator<Integer>i=list3.iterator(); i.hasNext()==true; ) {
                if(i.next()<4){

                    i.remove();
                }
        }
        System.out.println(list3);

        System.out.println("_______________________________");

        List<Integer>list4= new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4

        //after the lambda expression introduced as a method in the iterable interface,
        //removing the element from any collection is not that hard any more
        list4.removeIf(p->p<4);

        System.out.println(list4);

    }

}
