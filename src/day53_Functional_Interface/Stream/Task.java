package day53_Functional_Interface.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {

        //1. Write a program that can remove the duplicated elements of an array of String

        String[]array={"mahmut","ahmet","yuksel","bilal","mahmut"};

        List<String> col = Arrays.stream(array).distinct().collect(Collectors.toList());
        System.out.println("col = " + col);

        //2. Write a program that can remove the duplicated elements of a List of String
        List<String>listString=new ArrayList<>(Arrays.asList("mahmut","ahmet","yuksel","bilal","mahmut"));

       listString= listString.stream().distinct().collect(Collectors.toList());

        System.out.println("listString = " + listString);

        // Write a program that can count how many "java" and "python" does the array has:
        //	ex: array = {"Java", "jAVa", "pythON"}
        String []arr= {"Java", "jAVa", "pythON"};
        long countJava=0;
        long countPython=0;
        countJava = Arrays.stream(arr).filter(p -> p.equalsIgnoreCase("java")).count();
        countPython = Arrays.stream(arr).filter(p -> p.equalsIgnoreCase("python")).count();

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
/*Stream Tasks:
	1. Write a program that can remove the duplicated elements of an array of String

	2. Write a program that can remove the duplicated elements of a List of String

	3. Write a program that can count how many "java" and "python" does the array has:
			ex: array = {"Java", "jAVa", "pythON"}

			output:
				countJava = 2
				countPython = 1

	4.4 Write a program that can count how many negative numbers does the array has
		ex: arr = {1,2,3,4,-4,5,-5}

		output:
			2

	4.4 Write a program that can count how many Positive numbers does the List has
		ex: List = {1,2,3,4,-4,5,-5}

		output:
			5

	4. Wirte a program that can return all the negative numbers of the array as a new array
		ex:
			arr = {1,2,3,4,-4,5,-5}

		output:
			{-4, -5}

	4. Wirte a program that can return all the positive numbers of List without the duplcaites
		ex:
			list = {1,2,3,4,-4,5,-5,1,2,3,4}

		output:
			{1,2,3,4,5}


	5. Wirte a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}

	6. Write a program that can returun the unique elements of an array as a new array:

		Ex: arr = {1,1,2,3,3,4,5,5,6};

		output:
			{2,4,6}






*/