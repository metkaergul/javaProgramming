package day39_Recap.ScrumTask;

public class Tester extends Employee {


    public Tester(String name, int age, char gender,String jobTitle,  int ID, double salary, String companyName) {
        super(name, age, gender,jobTitle, ID, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working on the test case");;
    }
}
