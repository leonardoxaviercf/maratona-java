package xavier.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private  String nome;
    private  String cpf;
    private Endereco endereco;

//    public Pessoa(String nome, String cpf, Endereco endereco) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.endereco = endereco;
//    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
