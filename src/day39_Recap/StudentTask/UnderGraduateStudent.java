package day39_Recap.StudentTask;

public class UnderGraduateStudent extends Student{
    public UnderGraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" as an undergraduate seeking degrees");;
    }


}
