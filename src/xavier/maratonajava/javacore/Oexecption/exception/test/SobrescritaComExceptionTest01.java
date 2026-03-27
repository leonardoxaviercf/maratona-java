package xavier.maratonajava.javacore.Oexecption.exception.test;

import xavier.maratonajava.javacore.Oexecption.exception.domain.Funcionario;
import xavier.maratonajava.javacore.Oexecption.exception.domain.LoginInvalidoException;
import xavier.maratonajava.javacore.Oexecption.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
}
