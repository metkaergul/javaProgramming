package week16.abstractionexercise;

public class Swimming extends Exercise{

    public Swimming(double weight) {
        super(weight);
    }

    @Override
    int getCaloriesCount(int minutes) {
        return 0;
    }

    @Override
    void perform() {
        System.out.println("performing swimming in the pool");
    }
}
