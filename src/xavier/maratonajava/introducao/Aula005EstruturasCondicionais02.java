package xavier.maratonajava.introducao;

public class Aula005EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infatil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 14;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
