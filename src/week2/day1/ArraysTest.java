package week2.day1;

public class ArraysTest {

    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        System.out.println();
        String[] strings = new String[]{"A", "B", "C", "D"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();
        int[][][] mtx = new int[5][10][7];
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                for (int k = 0; k < mtx[0][0].length; k++) {
                    System.out.print(mtx[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }



    }

}
