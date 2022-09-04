package week18.interfaceDemo;

public class SuperMan {
    public static void main(String[] args) {

        Father supermanOne= new Father();
        supermanOne.work("sdet");
        System.out.println("makes = " + supermanOne.getPaid()+"$100");



                Father grandFather= new Superfather();
                grandFather.playWithKid();//object type decides the implementation
    }
}
