package day_14;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (true){
            System.out.println("Enter the details of Student "+(count++));

            System.out.println("Enter Roll");
            int roll= sc.nextInt();

            System.out.println("Enter Name :");
            String name= sc.next();

            System.out.println("Enter marks");
            int marks= sc.nextInt();

            Student student = new Student(roll,name,marks);

            students.add(student);

            System.out.println("Want More (y/n) ?");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("n"))
                break;
        }


        System.out.println("Printing Details of all Students");
        System.out.println("=================================");
        for(Student student: students){

            System.out.println("Roll is :"+student.getRoll());
            System.out.println("Name is :"+student.getName());
            System.out.println("Marks is :"+student.getMarks());

            System.out.println("-----------------------------");

        }
    }
}
