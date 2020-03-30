package Encapsulation;

public class TestStudent {
    public static void main (String [] args) {

        Student myStudent = new Student();
                myStudent.setStudentName("Shammo");
                myStudent.setStudentID(123);
                myStudent.setStudentGPA ("Grade A");
                myStudent.setStudentDOB("10/10/2009");

                Student mySon = new Student("SHAMMO",1234,"GRADE A+","10/10/2009");

                System.out.println(myStudent.getStudentName()+"\n"+ myStudent.getStudentID()+"\n"+myStudent.getStudentGPA()+"\n"+myStudent.getStudentDOB());

                System.out.println("");

                System.out.println(mySon.getStudentName()+"\n"+ mySon.getStudentID()+"\n"+mySon.getStudentGPA()+"\n"+mySon.getStudentDOB());
    }

}
