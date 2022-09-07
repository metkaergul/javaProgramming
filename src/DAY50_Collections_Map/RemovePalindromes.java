package DAY50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar",
                        "kayak", "reviver", "racecar", "madam")
        );

        Iterator<String> it = names.iterator();

        while(it.hasNext()){

            String str= it.next();

            String reverse= "";

            for (int i = str.length()-1; i >=0 ; i--) {

                reverse+=str.charAt(i);

            }
            if(str.equalsIgnoreCase(reverse)){
                System.out.println(str+" is a palindrome");
                it.remove();
            }



        }
        System.out.println(names);


    }
}
