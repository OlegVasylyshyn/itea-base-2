package week9.thread;

public class ThreadGroupTest {

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
        thread.setName("MyThread");
        thread.setDaemon(false);
        thread.start();

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        threadGroup = threadGroup.getParent();

        Thread[] threads = new Thread[100];
        threadGroup.enumerate(threads);

        for(Thread t : threads) {
            if(t == null) continue;
            System.out.println("Name - " + t.getName());
            if(t.getName().equals("Signal Dispatcher")) t.stop();
        }

    }

}
