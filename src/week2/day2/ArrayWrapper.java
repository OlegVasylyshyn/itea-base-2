package week2.day2;

public class ArrayWrapper {

    static int size = 0;
    static int[] arr = new int[10];


    public void add(int num) {
        if(size >= arr.length) {
            copyArray();
        }
        arr[size++] = num;
    }

    private void copyArray() {
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }

    public int[] sort(){
        return null;
    }

    public String toSting(){
        return null;
    }

    public int search(int value){
        return 0;
    }

    public int[] copy(){
        return null;
    }

    public int[] revers(){
        return null;
    }

    public int max(){
        return 0;
    }

    public int min(){
        return 0;
    }

}
