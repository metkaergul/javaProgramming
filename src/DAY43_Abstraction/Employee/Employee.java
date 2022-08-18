package DAY43_Abstraction.Employee;

public abstract class Employee extends Person {


    private final int ID;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age);
        if(ID<=0){
            throw new RuntimeException("INVALID ID "+ID);
        }
        this.ID=ID;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" +getAge() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
