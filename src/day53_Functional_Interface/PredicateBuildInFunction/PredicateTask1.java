package day53_Functional_Interface.PredicateBuildInFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTask1 {
    public static void main(String[] args) {

        Predicate<String> hasDuplicate = (s) -> {

            //              boolean flag=false;
//            String[]array=s.split("");
//
//            for (String each : array) {
//                int count=0;
//                for (String innerEach : array) {
//                    if(each.equalsIgnoreCase(innerEach)){
//                        count++;
//                    }
//                }
//                if(count>1){
//                    flag=true;
//                    break;
//                }
//            }
            // return flag;

            boolean flag = false;
            String[] array = s.split("");
            Set<String> set = new HashSet<>();
            for (String each : array) {
                set.add(each);
            }
            if (set.size() == array.length) {
                flag = false;
            } else {
                flag = true;
            }

            return flag;

        };

        String test = "aliba";
        boolean testresult = hasDuplicate.test(test);
        System.out.println(testresult);

        System.out.println("____________________________");

        Predicate<String> password = (p) -> {

            boolean r1 = false;
            boolean r2 = false;
            boolean r3 = false;
            boolean r4 = false;
            boolean r5 = false;

            if (p.length() >= 8 && !(p.contains(" "))) {
                r1 = true;
            }
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) >= 65 && p.charAt(i) <= 90) {
                    r2 = true;//uppercase
                } else if (p.charAt(i) >= 97 && p.charAt(i) <= 122) {
                    r3 = true;//lowercase

                } else if (p.charAt(i) >= 48 && p.charAt(i) <= 57) {
                    r4 = true;//digit
                } else {
                    r5 = true;//special
                }

            }
            boolean result = r1 && r2 && r3 && r4 && r5;
            return result;
        };
        String pass = "" +
                "!123sdnkmx";
        boolean result = password.test(pass);
        System.out.println(result);
    }
}

/*Use Predicate Functional interface to:
		3.1 Create a function that can verify if a string contains duplicated characters

		3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        1 Password must be at least have 8 characters long, and should not contain space
		        2 PassWord should at least contain one upper case letter
		        3 PassWord should at least contain one lower case letter
		        4 Password should at least contain one special characters
		        5 Password should at least contain a digit*/