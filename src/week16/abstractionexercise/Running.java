package week16.abstractionexercise;

public class Running extends Exercise{
    public Running(double weight){
        super(weight);  // call parent abstract class constructor
    }

    @Override
    public int getCaloriesCount(int minutes) {  // All overriding rules apply
        return (int)(minutes*13*(weight/100));
    }

    @Override
    public void perform() {


}
}