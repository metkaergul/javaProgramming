package day38_Inheritance.EmployeeTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Product Owner", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" is working closely with the client");;
    }
}
