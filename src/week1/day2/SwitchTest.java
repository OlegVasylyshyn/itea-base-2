package week1.day2;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age - ");
        int age = scanner.nextInt();


        switch (age) {

            case 10 : {
                System.out.println("It was 10");
                System.out.println("");
                break;
            }
            case 15 : {
                System.out.println("It was 15");
                break;
            }
            default: {
                System.out.println("default");
            }

        }


    }

}
