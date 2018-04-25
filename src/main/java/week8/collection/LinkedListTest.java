package week8.collection;

import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20_000_000; i++) {
            ll.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Add time LL - " + calculateTime(startTime, endTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20_000_000; i++) {
            al.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Add time AL - " + calculateTime(startTime, endTime));
        System.out.println();


        // remove from head
        startTime = System.nanoTime();
        ll.remove(0);
        endTime = System.nanoTime();
        System.out.println("Remove from head LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.remove(0);
        endTime = System.nanoTime();
        System.out.println("Remove from head AL - " + calculateTime(startTime, endTime));
        System.out.println();

        // remove from tail
        startTime = System.nanoTime();
        ll.remove(20_000_000 - 2);
        endTime = System.nanoTime();
        System.out.println("Remove from tail LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.remove(20_000_000 - 2);
        endTime = System.nanoTime();
        System.out.println("Remove from tail AL - " + calculateTime(startTime, endTime));
        System.out.println();


        // remove from center
        startTime = System.nanoTime();
        ll.remove(20_000_000 / 2);
        endTime = System.nanoTime();
        System.out.println("Remove from center LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.remove(20_000_000 / 2);
        endTime = System.nanoTime();
        System.out.println("Remove from center AL - " + calculateTime(startTime, endTime));
        System.out.println();

        // search something in center
        startTime = System.nanoTime();
        ll.contains(20_000_000 / 2);
        endTime = System.nanoTime();
        System.out.println("Search from center LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.contains(20_000_000 / 2);
        endTime = System.nanoTime();
        System.out.println("Search from center AL - " + calculateTime(startTime, endTime));
        System.out.println();

        // search from head
        startTime = System.nanoTime();
        ll.get(3);
        endTime = System.nanoTime();
        System.out.println("Search from head LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.get(3);
        endTime = System.nanoTime();
        System.out.println("Search from head AL - " + calculateTime(startTime, endTime));
        System.out.println();

        // search from tail
        startTime = System.nanoTime();
        ll.get(20_000_000 - 4);
        endTime = System.nanoTime();
        System.out.println("Search from tail LL - " + calculateTime(startTime, endTime));

        startTime = System.nanoTime();
        al.get(20_000_000 - 4);
        endTime = System.nanoTime();
        System.out.println("Search from tail AL - " + calculateTime(startTime, endTime));
        System.out.println();


        Deque<Integer> deque = new LinkedList<>();


        System.out.println(ll.equals(al));

        List<String> immutableList = Arrays.asList("A", "B", "C");
        immutableList.add("D");

    }

    private static double calculateTime(long startTime, long endTime) {
        return (endTime - startTime) / 1000.0;
    }

}
