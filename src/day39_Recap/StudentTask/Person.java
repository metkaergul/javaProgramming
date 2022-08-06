package day39_Recap.StudentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        char[]array = name.toCharArray();
        for (char eachSeq : array) {

           if( (!(Character.isLetterOrDigit(eachSeq)))&& !(eachSeq ==' ')) {
               System.err.println("name can not contains special character");
               System.exit(1);
           }
            this.name = name;
        }

        if(name==null||name.isEmpty()){
            System.err.println("name can not be null or empty");
            System.exit(1);
        }

        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {

        if(!(gender=='M'||gender=='F')){
            System.err.println("invalid gender "+gender);
        }
        this.gender = gender;
    }

    public void eat(){

        System.out.println(name+"is eating");
    }

    public void drink() {
        System.out.println(name+" is drinking ");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()
					*/