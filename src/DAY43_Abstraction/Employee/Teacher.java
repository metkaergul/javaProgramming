package DAY43_Abstraction.Employee;

public final class Teacher extends Employee{


    public Teacher(String name, char gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 4 hours");
    }


}
