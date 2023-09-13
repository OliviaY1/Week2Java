package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
	    Person p = new Person(name, "moogah");
        Student s = new Student(name, "yanxi6", "idfsdfs");
        System.out.println(p);
    }
}
// 哪些是mutable，哪些是alias？