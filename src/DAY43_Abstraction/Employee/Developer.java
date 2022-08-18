package DAY43_Abstraction.Employee;

public final class Developer extends Employee{


    public Developer(String name, char gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" never sleeps");
    }

    public void unitTest(){

        System.out.println(getName()+" is doing unit testing");

    }
}
