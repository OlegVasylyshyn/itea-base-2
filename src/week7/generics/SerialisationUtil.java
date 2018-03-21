package week7.generics;

import week3.student.Student;
import week6.io.serialisation.User;

public class SerialisationUtil {

    public static void main(String[] args) {

        User dex = new User("Dex", 23);
        String json = toJson(dex);

        json = toJson(new Student("Dex", 23, 3.4));

        Student student = fromJson(json, Student.class);

    }

    public static <T> String toJson(T o){
        return "{}";
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return null;
    }

}
