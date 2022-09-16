package day53_Functional_Interface.ArrayFunction;

public class ArrayFunctionTask1 {

    public static void main(String[] args) {

        //Create a function that can return the maximum number from an array of Integers
        ArrayFunction<int[],Integer>returnMax=(a)->{

            Integer max= Integer.MIN_VALUE;
            for (int each : a) {
                if(each>max){
                    max=each;
                }
            }

        return max;
        };
        int[]arr={1,2,3,4,5};

        Integer maxresult = returnMax.apply(arr);
        System.out.println(maxresult);

        System.out.println("____________________");
        
        
        //Create a function that can return the longest String from an array of String
        ArrayFunction<String[],String>days=(d)->{


            int longestStringLength=0;
            String longest="";
            for (String each : d) {
                if(each.length()>longestStringLength){

                    longestStringLength=each.length();
                    longest=each;

                }
            }
            return longest;
            
        };

        String[]arrStr={"mahmut","alex","delgado"};
        String app = days.apply(arrStr);
        System.out.println(app);

        System.out.println("________________________________");


    }
}
/*Use the ArrayFunction interface to:

		2.1 Create a function that can return the maximum number from an array of Integers

		1.2 Create a function that can return the minimum number from an array of Integers

		1.3 Create a function that can return the longest String from an array of String

		1.4 Create a function that can return the shortest String from an array of String

	*/