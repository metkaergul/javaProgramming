package day38_Inheritance.EmployeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int ID,  double salary, String companyName) {
        super(name, age, gender, ID, "Scrum Master", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" is working as a facilitator");;
    }
}
