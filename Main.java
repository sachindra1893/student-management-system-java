import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);

        manager.addStudent(s);
        manager.viewStudents();
    }
}