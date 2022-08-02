package day39_Recap.CydeoTask;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working with students");;
    }
}
