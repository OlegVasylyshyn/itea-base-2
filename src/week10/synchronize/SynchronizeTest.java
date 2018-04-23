package week10.synchronize;

public class SynchronizeTest {

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {

            try {

                System.out.println("Wait");
                synchronized (SynchronizeTest.class) {
                    SynchronizeTest.class.wait();
                    System.out.println("Sleep 1 finished");
                }

            } catch (InterruptedException ignore) { /*NOPE*/ }


        }).start();

        new Thread(() -> {

            try {

                System.out.println("Wait");
                synchronized (SynchronizeTest.class) {
                    SynchronizeTest.class.wait();
                    System.out.println("Sleep 2 finished");
                }

            } catch (InterruptedException ignore) { /*NOPE*/ }


        }).destroy();

        new Thread(() -> {

            try {
                Thread.sleep(5_000);
                System.out.println("Sent notify");
                synchronized (SynchronizeTest.class) {
                    SynchronizeTest.class.notifyAll();
                    System.out.println("Notify thread finished");
                }
            } catch (InterruptedException ignore) { /*NOPE*/ }

        }).start();

    }



}
