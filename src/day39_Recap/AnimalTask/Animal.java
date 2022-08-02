package day39_Recap.AnimalTask;

public class Animal {
    private String name,breed;
    private char gender;
    private String size;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()||breed.isBlank()){
            System.err.println("invalid name: "+breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setGender(char gender) {
        if( !(gender=='M'||gender=='F') ){
            System.err.println("invalid gender: "+gender);
        }
        this.gender = gender;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("big"))){
            System.err.println("invalid size: "+size );
            System.exit(1);
        }
        this.size = size;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank()){
            System.err.println("invalid color: "+color);
            System.exit(1);
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setSize(size);
        setAge(age);
        setColor(color);
    }

    public void eat(){

        System.out.println(name+" is eating");
    }
    public void drink(){

        System.out.println(name+" is drinking");
    }
    public void move(){

        System.out.println(name+" is moving");
    }
    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
