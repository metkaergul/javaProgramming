package DAY43_Abstraction.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",'M',34,4256,"SDET",145000.00);
        Developer developer = new Developer("Alex",'M',32,3278,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",'F','F',2265,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",'M',31,4298,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        // developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();




    }

}
