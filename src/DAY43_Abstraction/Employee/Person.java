package DAY43_Abstraction.Employee;

public abstract class Person {

    private  String name;
    private  char gender;
    private  int age;


    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if(age<=0){

            throw new RuntimeException("Invalid age "+age);
        }
        this.age = age;
    }

    public  void eat(){
        System.out.println(name+" is eating baklava");

    }
    public abstract void sleep();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
