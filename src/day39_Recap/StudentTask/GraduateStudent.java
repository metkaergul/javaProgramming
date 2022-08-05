package day39_Recap.StudentTask;

import day39_Recap.StatesTask.States;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" as a graduate student know better than others");;
    }
}
/*GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary
*/