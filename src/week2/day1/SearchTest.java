package week2.day1;

public class SearchTest {

    public static void main(String[] args) {
        int[] nums = Algorithms.initArray(100_000_000);
//        Algorithms.showArray(nums);
        System.out.println("Was created.");

        long startTime = System.currentTimeMillis();
        boolean isIn = binarySearch(nums, 100_0000_000);
        long endTime = System.currentTimeMillis();
        System.out.println("Time was - " + (endTime - startTime));

        System.out.println("Found - " + isIn);
    }

    private static boolean lineSearch(int[] nums, int value) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == value) {
                return true;
            }
            step++;
        }
        System.out.println("Steps - " + step);
        return false;
    }

    private static boolean binarySearch(int[] nums, int value) {
        int step = 0;
        int min = 0, max = nums.length - 1, mid = (nums.length - 1) / 2;
        while (min <= max) {
            if(nums[mid] == value) {
                System.out.println("Steps was - " + step);
                return true;
            } else if(nums[mid] > value) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            mid = (min + max) / 2;
            step++;
        }
        System.out.println("Steps was - " + step);
        return false;
    }


}
