package xavier.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long  id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga o) {
        // Retorna negativo se o this < o
        // Retorna 0 se this = o
        // Retorna positivo se this > o

//        Implementando se fosse um tipo primitivo
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

//        O Long já possui o seu próprio compareTo
        return this.id.compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
