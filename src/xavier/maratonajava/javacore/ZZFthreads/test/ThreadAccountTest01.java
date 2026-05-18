package xavier.maratonajava.javacore.ZZFthreads.test;

import xavier.maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("ERRO");
            }
        }
    }

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "T1");
        Thread t2 = new Thread(threadAccountTest01, "T2");

        t1.start();
        t2.start();
    }

    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro suficiente para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());
        }
    }
}
