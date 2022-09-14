package day51_Map;

public class TestEnum {
    public static void main(String[] args) {

        //   String browser = "Wooden Spoon";
        Browser browser = Browser.SAFARI;

        switch(browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }


        System.out.println("-------------------");


        Season season = Season.SUMMER;

        System.out.println("_____________________");

        Day sunny=Day.SUNDAY;

        if(sunny==Day.MONDAY){

            System.out.println("Monday is selected as a sunny day");
        } else if (sunny==Day.TUESDAY) {
            System.out.println("Tuesday is selected as a sunny day");
        }else if (sunny==Day.WEDNESDAY) {
            System.out.println("Wednesday is selected as a sunny day");
        }else if (sunny==Day.THURSDAY) {
            System.out.println("Thursday is selected as a sunny day");
        }else if (sunny==Day.FRIDAY) {
            System.out.println("Friday is selected as a sunny day");
        }else if (sunny==Day.SATURDAY) {
            System.out.println("Saturday is selected as a sunny day");
        }else
            System.out.println("Sunday is selected as a sunny day");
        }


    }

