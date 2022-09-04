package week18.interfaceDemo;

public class Mother extends Parent{
    @Override
    public void raiseKid() {
        System.out.println("raising the kids");
    }

    @Override
    public void playWithKid() {
        System.out.println("Playing with the kid everytime");
    }

    @Override
    public void feedKid() {
        System.out.println("Preparing the food ");
    }
}
