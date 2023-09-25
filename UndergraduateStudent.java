// the UndergraduateStudent class inherits from the student class
public class UndergraduateStudent extends Student{
    private Integer year;

    public UndergraduateStudent(int _studentNumber, String _name, String _course, String _classification, int _year){
        super(_studentNumber, _name, _course, _classification);
        this.year = _year;
    }

    @Override
    public String getYear(){
        String yearString = year.toString();
        return yearString;
    }
}