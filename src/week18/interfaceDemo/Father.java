package week18.interfaceDemo;

public class Father extends Parent implements Worker{
    @Override
    public void raiseKid() {

    }

    @Override
    public void playWithKid() {
        System.out.println("Playing with the kid occasionally");
    }

    @Override
    public void feedKid() {
        System.out.println("providing supllies home");
    }

    @Override
    public void work(String work) {
        System.out.println("working very hard as"+work);
    }

    @Override
    public double getPaid() {
        return 2323;
    }
}
