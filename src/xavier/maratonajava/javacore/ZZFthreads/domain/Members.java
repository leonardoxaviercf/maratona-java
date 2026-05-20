package xavier.maratonajava.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }
    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName +  " adicionou email na lista");
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking is there are emails");
        synchronized (emails) {
            while(emails.size() == 0) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem email disponível na lista, entrando em modo de espera");
                emails.wait();
            }

            return emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName() + " notificando que não estamos mais pegando emails");
        }
    }
}
