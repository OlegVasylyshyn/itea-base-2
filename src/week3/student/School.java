package week3.student;


import java.util.Scanner;

public class School {

    private final static int ADD_NEW_STUDENT = 1;
    private final static int REMOVE_STUDENT = 2;
    private final static int DISPLAY_ALL_STUDENTS = 3;
    private final static int EXIT = 4;

    private StudentManager manager = new StudentManager();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Hello director");
        while (true) {
            showMenu();
            int act = scanner.nextInt();
            switch (act) {
                case ADD_NEW_STUDENT: {
                    manager.addNewStudent();
                    break;
                }
                case REMOVE_STUDENT: {
                    manager.removeStudent();
                    break;
                }
                case DISPLAY_ALL_STUDENTS: {
                    manager.displayAllStudents();
                    break;
                }
                case EXIT: {
                    System.out.println("Good bye");
                    return;
                }
                default: {
                    System.out.println("Unknown command !!!");
                }
            }
        }

    }

    private void showMenu() {
        System.out.println("Choose your act");
        System.out.println("1) Add student");
        System.out.println("2) Remove student");
        System.out.println("3) Display all students");
        System.out.println("4) Exit");
    }
}
