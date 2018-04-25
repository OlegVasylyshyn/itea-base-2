package week2.day2;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String s = "My name is Dexter     ";

        System.out.println(s.toUpperCase());
        System.out.println(s);

        System.out.println(s.toLowerCase());
        System.out.println(s);

        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s);
        System.out.println(s.split(" ")[2]);

        System.out.println(s.substring(3));
        System.out.println(s);

        System.out.println(s.substring(3, 8));
        System.out.println(s);

        System.out.println(s.trim());
        System.out.println(s);

        System.out.println(s.charAt(4));
        System.out.println(s);

        System.out.println(s.contains("is"));
        System.out.println(s);

        System.out.println(s.startsWith("My"));
        System.out.println(s);

        System.out.println(s.replace("My", "Your"));
        System.out.println(s);

        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));



        String firstName = "Dex";
        String secondName = new String("Dex");

        System.out.println(firstName == secondName);
        System.out.println(firstName.equals(secondName));

    }

}
