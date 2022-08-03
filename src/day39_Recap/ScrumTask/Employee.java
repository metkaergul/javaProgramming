package day39_Recap.ScrumTask;

public class Employee extends Person {

    private String jobTitle;
    private int ID;
    private double salary;
    private String companyName;


    public String getJobTitle() {
        return jobTitle;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setID(int ID) {

        if(ID<=0){
            System.err.println("invalid ID "+ID);
        }
        this.ID = ID;
    }

    public void setSalary(double salary) {

        if(salary<=0){
            System.err.println("invalid salary: "+salary);
        }
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        if(companyName.isEmpty()||companyName.isBlank()){
            System.err.println("invalid entry: "+companyName );
        }
        this.companyName = companyName;
    }

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setID(ID);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public void work(){

        System.out.println(getJobTitle()+" "+getName()+" is "+"working");
    }

    public String toString() {
        return "Employee{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
