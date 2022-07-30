package day38_Inheritance.EmployeeTask;

public class ScrumTeam {
    public static void main(String[] args) {

        Tester tester=new Tester("ali",34,'M',789,"QA",99000,"Accenture");

        tester.work();

        System.out.println(tester);

        ScrumMaster scrumMaster=new ScrumMaster("ayse",32,'F',1234,100000,"Cydeo");

        scrumMaster.work();
        System.out.println(scrumMaster);


    }
}
