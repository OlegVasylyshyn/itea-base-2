package week6.io.serialisation;

import java.io.*;

public class SerialisationUtil {

    private SerialisationUtil(){}


    public static void persistUser(User dex) {

        try (
                FileOutputStream fos = new FileOutputStream("student.student");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {

            oos.writeObject(dex);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static User readUser() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.student"));
        ) {
            return  (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class A implements AutoCloseable {

    public static void main(String[] args) {
        try (A a = new A()) { }
    }

    @Override
    public void close() {
        System.out.println("CLOSE");
    }
}