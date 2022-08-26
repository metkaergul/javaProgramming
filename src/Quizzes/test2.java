package Quizzes;
class test1{

  protected void method(){
      System.out.println("A");
  }
  private void method(int a){
      System.out.println("B");
  }


}
public class test2 extends test1 {


   // @Override   you cann not override private method from the super class
    public void method(int a){
        System.out.println("C");
    }
    public static void main(String[] args) {

            test2 obj= new test2();
            obj.method();
    }




}
