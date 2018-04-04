package week9.thread;

public class StopThread {

    public static void main(String[] args) {

        // Stop
        Thread thread1 = new Thread(() -> {

            try {
                work();
            } catch (ThreadDeath e) {
                System.out.println("Caught");
            }

        });

        thread1.start();


        // Killer
        Thread killer = new Thread(() -> {
            System.out.println("Take a nap");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Awake");
            thread1.stop();
            System.out.println("Killed");
        });
        killer.start();

    }

    private static void work() {
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("THREAD RUN");

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
