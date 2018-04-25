package week4.day1;

import week3.zoo.Cat;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList() {
            {
                add(1);
                add(2);
                add("");
                add(new Cat());
            }
        };

        run(new Runnable() {
            @Override
            public void run() {
                System.out.println("RUN");
            }
        });

        run(new Runnable() {
            @Override
            public void run() {
                System.out.println("RUN2");
            }
        });

        run(new Runnable() {
            @Override
            public void run() {
                System.out.println("RUN3");
            }
        });

    }

    private static void run(Runnable runnable) {
        runnable.run();
    }

}


interface Runnable {
    void run();
}
