package week5.bit;

public class BitsOperations {

    public static void main(String[] args) {


        int b = 0;      // 00000000
        b = 1;          // 00000001
        b = 3;          // 00000011

        b = 2;          // 00000010

        b <<= 2;        // 00001000
        System.out.println(b);

        int result = 4 | 2; // 00000100 + 00000010 -> 00000110
        System.out.println(result);

        result = 6 & 4;     // 00000110 + 00000100 -> 00000100
        System.out.println(result);

        result = 6 ^ 4;     // 00000110 + 00000100 -> 00000010
        System.out.println(result);

        // 4 bytes -> 32 bit -> (-2^31 - 1) - (+ 2^31)

    }

}
