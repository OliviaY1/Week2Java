package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid;  // In Java, new a variable is important
    // private: access modifier, only within the current braces.
    public Student(String[] name, String utorid, String studentid){
        super(name, utorid); // Person expects two arguments: name & utorid
        this.studentid = studentid;  // this in java == self in python
    }
}
