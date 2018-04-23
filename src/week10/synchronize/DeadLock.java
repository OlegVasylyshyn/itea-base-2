package week10.synchronize;

public class DeadLock {


    public static void main(String[] args) {

        Object monitor = new Object();

        new Thread(() -> {

            System.out.println("Wait for notify");
            synchronized (monitor) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {

                }
            }

        }).start();

        new Thread(() -> {

            System.out.println("Wait for notify");
            synchronized (monitor) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {

                }
            }

        }).start();



    }

}
