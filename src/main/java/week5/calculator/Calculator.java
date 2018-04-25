package week5.calculator;

import java.math.BigDecimal;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {

        BigDecimal x = new BigDecimal(10);
        BigDecimal y = new BigDecimal(3);


        System.out.println(x.divide(y, 20, BigDecimal.ROUND_DOWN));
        System.out.println(Arrays.toString("5 + 2".split(" ")));

    }

}
