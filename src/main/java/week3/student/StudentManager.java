package week3.student;

import java.util.Scanner;

public class StudentManager {

    private Scanner scanner = new Scanner(System.in);
    private StudentGroup studentGroup = new StudentGroup();

    public void addNewStudent() {
        System.out.println();

        String name = getInputString("Enter students name - ");

        System.out.print("Enter students age - ");
        int age = scanner.nextInt();

        System.out.print("Enter students average mark - ");
        double averageMark = scanner.nextDouble();

        Student student = new Student(name, age, averageMark);
        studentGroup.add(student);

        System.out.println("Student was successfully added\n");
    }

    public void removeStudent() {
        String name = getInputString("Enter students name - ");
        System.out.println("Was entered next students name - " + name);
        studentGroup.removeByName(name);
        System.out.println("Student was successfully removed\n");
    }

    public void displayAllStudents() {
        System.out.println(studentGroup);
    }

    private String getInputString(String message){
        System.out.print(message);
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine();
        }
        return input;
    }
}
