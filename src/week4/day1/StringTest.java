package week4.day1;

public class StringTest {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 1_000_000; i++) {
            s.append(0);
        }

        System.out.println(s);
    }

}
