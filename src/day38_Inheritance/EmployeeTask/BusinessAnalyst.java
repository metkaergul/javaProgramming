package day38_Inheritance.EmployeeTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int ID,  double salary, String companyName) {
        super(name, age, gender, ID,"Business Analyst" , salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" is working as an analyst");;
    }
}
