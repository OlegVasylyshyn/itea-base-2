package week9.thread;

public class VolatileTest {

    private static volatile boolean interrupted;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            System.out.println("Start thread1");
            // spin lock
            while (!interrupted) ;
            System.out.println("Good bye");

        });
        thread1.setName("Name");

        Thread thread2 = new Thread(() -> {

            try {
                System.out.println("Take a nap");
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Sent interrupt");
            interrupted = true;

        });

        thread1.start();
        thread2.start();

    }

}
