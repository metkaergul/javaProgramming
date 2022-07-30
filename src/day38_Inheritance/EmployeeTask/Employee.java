package day38_Inheritance.EmployeeTask;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){

        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them

*/