package xavier.maratonajava.javacore.ZZFthreads.test;

import xavier.maratonajava.javacore.ZZFthreads.domain.Members;
import xavier.maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread chaves = new Thread(new EmailDeliveryService(members), "Chaves");
        Thread kikos = new Thread(new EmailDeliveryService(members), "Kikos");

        chaves.start();
        kikos.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
