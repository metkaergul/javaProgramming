package day39_Recap.ScrumTask;

public class Person {

    private String name;
    private int age;
    private char  gender;

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
        if(name.isEmpty()||name.isBlank()){
            System.err.println("invalid name: "+name);
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
        if( !(gender=='M'||gender=='F') ){
            System.err.println("invalid gender: "+gender);
        }
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
