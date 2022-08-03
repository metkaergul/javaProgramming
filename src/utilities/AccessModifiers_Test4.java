package utilities;

import day40_FinalKeyword.ProtectedAccessModifiers;

public class AccessModifiers_Test4 extends ProtectedAccessModifiers {

    public static void main(String[] args) {

       // System.out.println(ProtectedAccessModifiers.name1); // default is not visible outside the package
        System.out.println(ProtectedAccessModifiers.name2); //protected access modifier is visible outside the package only if we have an inheritance relationship between these calassee

    // ProtectedAccessModifiers.method1();//method1 has default access modifier that is why  it is not visible outside the package
     ProtectedAccessModifiers.method2();

    }
}
