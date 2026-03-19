package xavier.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("-----------");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println("Seminario: " + seminario.getTitulo());
            }
        } else  {
            System.out.println("Esse professor não está em nenhum seminário.");
        }
        System.out.println("-----------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return this.seminarios;
    }
}
