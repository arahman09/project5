package Encapsulation;

public class Student {

    private String studentName;
    private int studentID;
    private String studentGPA;
    private String studentDOB;

    public Student () {}

    public Student(String studentName, int studentID, String studentGPA, String studentDOB) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.studentDOB = studentDOB;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentGPA(String studentGPA) {
        this.studentGPA = studentGPA;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentGPA() {
        return studentGPA;
    }

    public String getStudentDOB() {
        return studentDOB;
    }


}