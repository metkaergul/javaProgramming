package day39_Recap.StudentTask;

public class CydeoStudent extends Student{

    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("invalid batch number: "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("invalid group number: "+groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if(programmingLanguage==null||programmingLanguage.isEmpty()){

            System.err.println("invalid entry for programming language");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getSchoolName()+" students"+getName()+" eat "+programmingLanguage);;
    }

    @Override
    public void drink() {
        System.out.println(getSchoolName()+" students"+getName()+" drink"+programmingLanguage);;
    }

    @Override
    public void sleep() {
        System.out.println(getSchoolName()+"students"+getName()+" never sleep only sleep with"+programmingLanguage);;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade()+
                ", schoolName='" + getSchoolName() + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +

                '}';
    }
}
/*CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included
*/