package week3.student;


import java.util.Scanner;

public class School {

    private static final School INSTANCE;

    private StudentManager manager = new StudentManager();
    private Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("FINAL");
        INSTANCE = new School();
    }

    private School(){
    }

    public static School getInstance(){
        return INSTANCE;
    }

    public void run() {
        System.out.println("Hello director");
        while (true) {
            showMenu();
            int act = scanner.nextInt();
            Menu menu = Menu.getMenu(act);
            switch (menu) {
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
                case DEFAULT: {
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
