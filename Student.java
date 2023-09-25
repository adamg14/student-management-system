import java.util.ArrayList;

public class Student{
    // encapsulation of the student attributes by setting the variables as private
    // access to these variables are controlled through the public functions e.g. getName
    // controlled access of attributes defined by public variables
    private int studentNumber;
    private String name;
    private String course;
    private String classification;

    private ArrayList<Student> students = new ArrayList<Student>();

    // constructor function 
    public Student(int _studentNumber, String _name, String _course, String _classification){
        this.studentNumber = _studentNumber;
        this.name = _name;
        this.course = _course;
        this.classification = _classification;
    }


    // public deleteStudent(){

    // }

    public void getStudent(){
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Classification: " + classification);
    }

    // getYear is an example of abstract function as there is no implementation detail in the Student superclass as the result of this function depends on the subclass of the student (undergraduate or postgraduate)
    // this function will be overwritten in each of the subclasses of this Student superclass
    public String getYear(){
        return "Function result not defined in superclass";
    };
}