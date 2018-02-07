package week1.day1;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number = ");
        int number = sc.nextInt();
        number++;
        System.out.println(number);

    }

}
