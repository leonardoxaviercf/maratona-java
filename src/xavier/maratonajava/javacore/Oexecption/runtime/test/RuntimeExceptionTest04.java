package xavier.maratonajava.javacore.Oexecption.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ao executar o ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro ao executar o IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao executar o IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Erro ao executar o RuntimeException");
        }

        try {
            talvezLanceExcecao();
        } catch (SQLException e) {
            System.out.println("Erro ao executar o SQLException");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao executar o FileNotFoundException");
        }
    }

    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException {

    }
}