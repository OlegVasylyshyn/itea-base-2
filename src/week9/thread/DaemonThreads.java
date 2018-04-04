package week9.thread;

public class DaemonThreads {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            for(;;) {
                System.out.println("THREAD RUN");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread.setDaemon(true);
        thread.start();

        Thread thread2 = new Thread(() -> {

            for(;;) {
                System.out.println("THREAD RUN");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread2.setDaemon(true);
        thread2.start();

    }

}
