package week2.day1;

public class SortTest {

    public static void main(String[] args) {

        int[] nums = Algorithms.initArray(10, 0, 10);
        Algorithms.showArray(nums);

        selectSort(nums);
        Algorithms.showArray(nums);

    }

    private static void bubbleSort(int[] nums){
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - (i + 1); j++) {
                if(nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
                steps++;
            }
        }
        System.out.println("Steps - " + steps);
    }

    private static void selectSort(int[] nums){
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length - 1; j++) {
                if(nums[min] > nums[j + 1]) {
                    min = j + 1;
                }
                steps++;
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
        System.out.println("Steps - " + steps);
    }

}
