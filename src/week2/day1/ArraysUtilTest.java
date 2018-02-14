package week2.day1;

import java.util.Arrays;

public class ArraysUtilTest {

    public static void main(String[] args) {

        int[] arr1 = Algorithms.initArray(100);
        int[] arr2 = Algorithms.initArray(10, 0, 10);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 4));

    }

}
