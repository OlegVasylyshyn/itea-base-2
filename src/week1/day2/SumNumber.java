package week1.day2;

public class SumNumber {

    public static void main(String[] args) {

        int num = 12345;
        int result = 0;

        while (num > 0) {
            int lastNumber = num % 10;
            num = (num - lastNumber) / 10;
            result += lastNumber;
        }

        System.out.println(result);

    }

}
