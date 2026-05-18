package xavier.maratonajava.javacore.ZZFthreads.test;

class ThreadExampleRunneable2 implements  Runnable {
    private final String c;

    public ThreadExampleRunneable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunneable2("Car"));
        Thread t2 = new Thread(new ThreadExampleRunneable2("Ro"));


        t1.start();
        t1.join();
        t2.start();

        System.out.println();
    }
}

