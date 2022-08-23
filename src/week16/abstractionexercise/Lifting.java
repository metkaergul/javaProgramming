package week16.abstractionexercise;

public abstract class Lifting extends Exercise{

    public Lifting(double weight) {
        super(weight);
    }
    abstract void endLift();
}
