package week2.day1;

import java.util.Scanner;

public class MethodTest {

    public static void main(String[] args) {

        // non-static method example
//        Scanner scanner = new Scanner(System.in);
//        scanner.next();

        // static method example
//        int max = Math.max(1, 2);

//        System.out.print(getInt());
//        System.out.print(getInt("Enter your age"));

//        a(0);

        int f = f(50);
        System.out.println(f);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        return scanner.nextInt();
    }

    private static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    private static int getInt(String... messages) {
        return 0;
    }

    private static void a(int num) {
        System.out.println(num);
        if(num < 5) {
            a(++num);
            System.out.println(num);
        }
    }

    // Fn = Fn-1 + Fn-2
    private static int f(int num) {
        return num > 2 ? f(num - 1) + f(num - 2) : 1;
    }

}
