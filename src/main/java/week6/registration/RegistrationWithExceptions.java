package week6.registration;

import java.util.Scanner;

public class RegistrationWithExceptions {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter email - ");
            String email = scanner.nextLine();
            System.out.print("Enter password - ");
            String pass = scanner.nextLine();

            try {
                registration(email, pass);
                System.out.println("SUCCESS");
                break;
            } catch (RegistrationException e) {
                System.out.println("Some exception occurred. Message - " + e.getMessage());
            } finally {
                System.out.println("FINALLY");
            }
        }
    }

    private static void registration(String email, String pass) throws RegistrationException {
        checkEmail(email);
        checkPass(pass);
        persistUser(new User(email, pass));
    }

    private static void checkPass(String pass) throws RegistrationException {
        pass = null;
        int length = pass.length();
        if(length < 5 || length > 10) {
            throw new RegistrationException("Wrong pass");
        }
    }

    private static void checkEmail(String email) throws RegistrationException {
        if(!email.contains("@")){
            throw new RegistrationException("Wrong email");
        }
    }

    private static void persistUser(User user) throws RegistrationException {
        if(System.currentTimeMillis() % 2 == 0) {
            throw new RegistrationException("Corrupted DB");
        }
    }
}

class RegistrationException extends Exception {
    RegistrationException(String message) {
        super(message);
    }
}