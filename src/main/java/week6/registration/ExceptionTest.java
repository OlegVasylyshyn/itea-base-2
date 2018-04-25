package week6.registration;

import week3.student.Run;

public class ExceptionTest {

    public static void main(String[] args) throws Exception {
        r();
    }

    private static void r(){
        System.out.println("*");
        try {
            r();
        } finally {
            r();
        }
    }

    private static String m1(){
        throw new RuntimeException();
    }

    private static User[] m2(){
        while (true);
    }

    private static System m3(){
        return m3();
    }

}
