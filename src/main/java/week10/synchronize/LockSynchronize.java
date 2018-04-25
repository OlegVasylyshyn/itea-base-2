package week10.synchronize;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSynchronize {

    private static Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        Condition condition = lock.newCondition();

        new Thread(() -> {

            try {

                System.out.println("Wait");
                lock.lock();
                    condition.await();
                    System.out.println("Sleep 1 finished");
                lock.unlock();

            } catch (InterruptedException ignore) { /*NOPE*/ }


        }).start();

        new Thread(() -> {

            try {

                System.out.println("Wait");
                lock.lock();
                    condition.await();
                    System.out.println("Sleep 2 finished");
                lock.unlock();

            } catch (InterruptedException ignore) { /*NOPE*/ }


        }).start();

        new Thread(() -> {

            try {
                Thread.sleep(5_000);
                System.out.println("Sent notify");
                lock.lock();
                    condition.signalAll();
                    System.out.println("Notify thread finished");
                lock.unlock();
            } catch (InterruptedException ignore) { /*NOPE*/ }

        }).start();


    }
}
