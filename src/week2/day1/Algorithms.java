package week2.day1;

public class Algorithms {

    public static void main(String[] args) {
        int[] arr1 = initArray(5, 0, 100);
        int[] arr2 = cloneArray(arr1);

        showArray(arr1);
        showArray(arr2);

        System.out.println();
        System.out.println("Arrays are equal - " + compareArray(arr1, arr2));

        System.out.println();
        arr1[0] = 99999;


        showArray(arr1);
        showArray(arr2);
    }

    private static boolean compareArray(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    private static int[] initArray(int length, int max, int min){
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min) + min);
        }
        return arr;
    }

    private static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    private static int[] copyArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    private static int[] cloneArray(int[] arr) {
        return arr.clone();
    }

}
