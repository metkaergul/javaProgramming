package DAY43_Abstraction.Employee;

public final class Tester extends Employee{


    public Tester(String name, char gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the App");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }
    public void bugReport(){

        System.out.println(getName()+" is preparing bug report");
    }
}
