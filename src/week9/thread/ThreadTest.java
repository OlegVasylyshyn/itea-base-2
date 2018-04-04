package week9.thread;

public class ThreadTest {

    public static void main(String[] args) {

        Thread thread = new Thread(ThreadTest::work);
        thread.setName("MyThread");
        thread.start();

        while (true) {
            System.out.println("MAIN RUN");

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void work(){

        while (true) {
            System.out.println("THREAD RUN");

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

