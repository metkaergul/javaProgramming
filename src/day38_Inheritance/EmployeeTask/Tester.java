package day38_Inheritance.EmployeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("Tester is working on the QA environment ");;
    }
}
