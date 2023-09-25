import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Student Management System");
        System.out.println("1. Add Student Record");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Student Records");
        System.out.print("Select an option: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        if(userInput.equals("1")){
            System.out.println("Select type of student record to add: ");
            System.out.println("1. Undergraduate Student: ");
            System.out.println("2. Postgraduate Student: ");
            System.out.print("Select an option: ");

            String studentType = scanner.nextLine();
            
            if(studentType.equals("1")){
                Student undergrad = new UndergraduateStudent(1234, "Adam", "Computer Science", "First", 3);
                // add an undergrade object to the a separate list
            }else if(studentType == "2"){
                System.out.println("hello world");
            }else{
                System.out.println("Selection Invalid.");
            }
        }
    }
}