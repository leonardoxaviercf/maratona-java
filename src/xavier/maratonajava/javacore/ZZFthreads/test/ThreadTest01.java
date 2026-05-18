package xavier.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
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
        }
    }
}

class ThreadExampleRunneable implements  Runnable {
    private final char c;

    public ThreadExampleRunneable(char c) {
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
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//            ThreadExample t1 = new ThreadExample('A');
//            ThreadExample t2 = new ThreadExample('B');
//            ThreadExample t3 = new ThreadExample('C');

        Thread t1 = new Thread(new ThreadExampleRunneable('A'));
        Thread t2 = new Thread(new ThreadExampleRunneable('B'));
        Thread t3 = new Thread(new ThreadExampleRunneable('C'));

        t1.start();
        t2.start();
        t3.start();
    }
}

