package week6.registration;

import java.util.Scanner;

public class RegistrationTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email - ");
        String email = scanner.nextLine();
        System.out.print("Enter password - ");
        String pass = scanner.nextLine();

        int status = registration(email, pass);
        if(status == 0) {
            System.out.println("User was successfully saved");
        } else if(status == -1) {
            System.out.println("Wrong email");
        } else if(status == -2) {
            System.out.println("Wrong password");
        } else if(status == -3) {
            System.out.println("Connection to DB broke");
        }

    }

    static int registration(String email, String pass) {
        int checkEmailStatus = checkEmail(email);
        if(checkEmailStatus == -1) {
            return -1;
        }
        int checkPassStatus = checkPass(pass);
        if(checkPassStatus == -1) {
            return -2;
        }
        int persistUserStatus = persistUser(new User(email, pass));
        if(persistUserStatus == -1) {
            return -3;
        }
        return 0;
    }

    static private int persistUser(User user) {
        if(System.currentTimeMillis() % 2 == 0) {
            return 0;
        }
        return -1;
    }

    static private int checkPass(String pass) {
        int length = pass.length();
        if(length > 5 && length < 10) {
            return 0;
        }
        return -1;
    }

    static private int checkEmail(String email) {
        if(!email.contains("@")){
            return -1;
        }
        return 0;
    }

}

class User{
    String email;
    String pass;

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }
}


