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

    /**
     * Remove element on specific position.
     *
     * Steps
     * 1) Create new array
     * 2) Copy all elements before deleted one in new array
     * 3) Copy all elements after deleted one in new array
     * 4) Resign `arr` reference to new array
     * 5) Result - new array without deleted element
     *
     * @param index - position of deleted element.
     * @throws ArrayIndexOutOfBoundsException - if index less then 0 and more than array length.
     *
     */
    public void remove(int index) {
    }

    /**
     * Remove element on specific position.
     *
     * Steps
     * 1) Use implemented search method (find index)
     * 2) Use remove method above
     *
     * @param value - position of deleted element.
     * @return true if was deleted. false - if wasn't
     *
     */
    public boolean removeValue(int value) {
        return false;
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
        return arr.clone();
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
