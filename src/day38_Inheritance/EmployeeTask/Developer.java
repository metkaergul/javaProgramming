package day38_Inheritance.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("Developer is working on the DEV environment ");;
    }

}
