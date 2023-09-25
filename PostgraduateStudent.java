// PostgraduateStudent class inherits from the Student super class
public class PostgraduateStudent extends Student{
    private String undergraduateCourse;

    public UndergraduateStudent(int _studentNumber, String _name, String _course, String _classification, int _undergraduateCourse){
        super(_studentNumber, _name, _course, _classification);
        this.undergraduateCourse = _undergraduateCourse;
    }

    @Override
    public String getYear(){
        return "Postgraduate Student";
    }
}