package day47_Polymorphism;

import DAY43_Abstraction.Employee.Developer;
import DAY43_Abstraction.Employee.Employee;
import DAY43_Abstraction.Employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismEmployeePractice {
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
        for (Employee eachEmployee : employees) {
            if(eachEmployee instanceof Tester){
                scrumMembers.add(eachEmployee);
            }
            if(eachEmployee instanceof Developer){
                scrumMembers.add(eachEmployee);
            }
        }

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();
        for (Employee eachScrumMember : scrumMembers) {
            if(eachScrumMember instanceof Tester){
                testers.add((Tester) eachScrumMember);
            }
            if(eachScrumMember instanceof Developer){
               developers.add((Developer) eachScrumMember);
            }

        }

        Tester hasMaxSalary=testers.get(0);

        for (Tester eachTester : testers) {
            if(eachTester.getSalary()>hasMaxSalary.getSalary()){

                hasMaxSalary=eachTester;
            }
        }
        System.out.println(  hasMaxSalary.getName()+" has max salary");

        System.out.println("_______________________");

        Developer hasMinSalary=developers.get(0);


        for (Developer eachDev : developers) {
            if(eachDev.getSalary()<hasMinSalary.getSalary()){

                hasMinSalary=eachDev;
            }
        }
        System.out.println(  hasMinSalary.getName()+" has min salary");



    }
}
/*
	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?
*/