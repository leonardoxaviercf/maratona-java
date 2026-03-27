package xavier.maratonajava.javacore.Oexecption.exception.test;

import xavier.maratonajava.javacore.Oexecption.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Goku";
        String passwordDB = "1234";

        System.out.println("Digite seu usuário: ");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String passwordDigitado = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");

    }
}
