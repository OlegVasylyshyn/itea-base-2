package week9.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Increment {

    private static int num = 0;
//    private static AtomicInteger num = new AtomicInteger(0);

    private static Lock lock = new ReentrantLock(false);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
            }
        });

        long startTime = System.nanoTime();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        long endTime = System.nanoTime();
        System.out.println(num);
        System.out.println("Total time - " + (endTime - startTime));
    }

//    private static synchronized void increment(){
//        synchronized (Increment.class) {
//            num++;
//        }
//    }

    private static void increment(){
        lock.lock();
            num++;
        lock.unlock();
    }

//    private static synchronized void increment(){
//        num.getAndIncrement();
//        // int ++
//        // ++ int
//    }

    // Synchronize - 117_915_539
    // Lock - 156_657_712
    // AtomicInteger - 91_843_457

}

