package day39_Recap.StatesTask;

public class StateObjects {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Democrats", "Glenn Youngkin", "Mark Warner", 8590000, 0.53);
        System.out.println(virginia);

        Texas texas = new Texas("Republicans", "Greg Abbott", "Ted Cruz", 28000000, 0.67);
        System.out.println(texas);
        System.out.println(texas.getGovernor());
    }



}
