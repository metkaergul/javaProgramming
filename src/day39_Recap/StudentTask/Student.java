package day39_Recap.StudentTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            System.err.println("field of study should not be empty or null");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setGrade(char grade) {

        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("invalid grade: " + grade);
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty()) {
            System.err.println("field of study should not be empty or null");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

/*Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
*/