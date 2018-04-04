package week9.thread;

public class InterruptThread {

    public static void main(String[] args) {

        // Interrupt
        Thread victim = new Thread(() -> {
            work();
        });
        victim.start();

        // Killer
        Thread killer = new Thread(() -> {
            System.out.println("Take a nap");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Awake");
            victim.interrupt();
            System.out.println("Killed");
        });
        killer.start();

    }

    private static void work() {
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("THREAD RUN");

            long i = 0;
            while (i++ < 1_000_000_000L);
            System.out.println("After spin lock");

        }
    }

}
