package day39_Recap.ScrumTask;



public class AmazonInc {

    public static void main(String[] args) {

        String companyName= "Cydeo";

       ProductOwner PO = new ProductOwner("Suhaib", 29, 'M', 1, 160000, companyName);



       ScrumMaster SM = new ScrumMaster("Anel", 26, 'F', 3, 145000, companyName);


   Tester tester1 = new Tester("Chinara", 32, 'F', "QA", 1415, 125000, companyName);

        Tester tester2 = new Tester("Yasaman", 31, 'F', "QE", 1416, 130000, companyName);

      Tester tester3 = new Tester("Irena", 29, 'F', "SDET", 1417, 128000, companyName);

        Tester tester4 = new Tester("Cihad", 26, 'M', "QA", 1418, 125000, companyName);
        Tester[] testers = { tester2, tester3, tester4};


       Developer developer1 = new Developer("Max", 40, 'M', "Senior Java Developer", 3665, 180000, companyName);
        Developer developer2 = new Developer("Allison", 18, 'F', "Junior Java Developer", 364, 120000, companyName);
   Developer developer3 = new Developer("Tom", 26, 'M', "Java Developer", 3654, 140000, companyName);
        Developer developer4 = new Developer("Manas", 40, 'M', "Full Stack Developer", 6568, 280000, companyName);
        Developer developer5 = new Developer("Evelyn", 30, 'F', "JS Developer", 788, 160000, companyName);
        Developer[] developers = { developer2, developer3, developer4, developer5};

        for (Developer developer : developers) {
            System.out.println( developer.getName());
        }
        ScrumTeam scrumTeam=new ScrumTeam(PO,SM);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDevelopers(developers);

        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println(scrumTeam.getTesters());


    }
}
