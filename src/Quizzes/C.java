package Quizzes;

public class C  extends B{

    @Override
    public void watchTV() {

    }
}

interface A{

    void readBook();
    abstract void watchTV();


}
abstract class B implements A{
    public void readBook(){
        System.out.println("reading book");
    }
}




