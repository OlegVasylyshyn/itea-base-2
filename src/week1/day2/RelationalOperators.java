package week1.day2;

import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age - ");
        int age = scanner.nextInt();

        if(age > 18 && age < 25) {
            System.out.println("True");
        } else if(age > 25 && age < 30) {
            System.out.println("True");
        }

//        System.out.println(age > 18 ^ age < 25 ? "True" : "False");

//        System.out.println(!false);


    }

}
