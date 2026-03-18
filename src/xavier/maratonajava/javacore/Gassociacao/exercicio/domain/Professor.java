package xavier.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println("Seminario: " + seminario);
            }
        } else  {
            System.out.println("Esse professor não está em nenhum seminário.");
        }
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
