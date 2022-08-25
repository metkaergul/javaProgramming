package day46_Polymorphism;

import DAY43_Abstraction.Employee.Developer;
import DAY43_Abstraction.Employee.Employee;
import DAY43_Abstraction.Employee.Tester;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeObjectsTask {
    public static void main(String[] args) {


        Employee[] employees = {
                new Tester("Sherali", 'M', 37, 1214, "QA", 110000),
                new Developer("Zuhal", 'F', 27, 2356, "Java Developer", 128000),
                new Tester("George", 'M', 28, 12789, "SDET", 120000),
                new Developer("Cristina", 'F', 42, 12764, "Software Developer", 135000),
                new Tester("Cihad", 'M', 30, 5907, "SDET", 105000),
                new Developer("Gulistan", 'F', 34, 12534, "Web Developer", 130000),
                new Tester("Yuliya", 'F', 28, 7, "QE", 120000),
                new Developer("Cassendra", 'F', 23, 8, "Front-end Developer", 140000),
                new Tester("Aygu", 'F', 25, 9, "SDET", 130000),
                new Developer("Sophie", 'F', 26, 10, "Back-end Developer", 150000),
                new Tester("Timur", 'M', 29, 11, "SDET", 115000),
                new Developer("Fady", 'F', 26, 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 'F', 24, 13, "QE", 125000),
                new Developer("Enes", 'M', 24, 14, "Full Stack Developer", 142000),
                new Tester("Mikael", 'M', 30, 15, "SDET", 105000),
        };

        List<Employee> scrumMembers = new ArrayList<>();
        for (Employee eachScrumMember : employees) {
            scrumMembers.add(eachScrumMember);
        }
        System.out.println(scrumMembers);

        System.out.println("______________________________");

        List<Tester> testers = new ArrayList<>();
        for (Employee eachEmployee : employees) {
            if(eachEmployee instanceof Tester){
                testers.add((Tester) eachEmployee);
            }
        }
        System.out.println(testers);
        System.out.println("________________________________________");

        List<Developer> developers = new ArrayList<>();
        for (Employee eachEmployee : employees) {
            if(eachEmployee instanceof Developer){
                developers.add((Developer) eachEmployee);
            }

        }

        double maxSalaryOfTester= testers.get(0).getSalary();


        int temp= 0;

        for (int i = 0; i < testers.size(); i++) {

            if(testers.get(i).getSalary()>maxSalaryOfTester){
                maxSalaryOfTester=testers.get(i).getSalary();
                temp=i;

            }
        }
        System.out.println(testers.get(temp).getName()+ " has the max salary: "+maxSalaryOfTester);



        System.out.println("_____________________________________");
        double maxSalaryOfDeveloper= developers.get(0).getSalary();


        int temp2= 0;

        for (int i = 0; i < developers.size(); i++) {

            if(developers.get(i).getSalary()>maxSalaryOfDeveloper){
                maxSalaryOfDeveloper=developers.get(i).getSalary();
                temp=i;

            }
        }
        System.out.println(developers.get(temp).getName()+ " has the max salary: "+maxSalaryOfDeveloper);

    }
}

/*Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};

    		(import them from day43 package)

	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?
*/