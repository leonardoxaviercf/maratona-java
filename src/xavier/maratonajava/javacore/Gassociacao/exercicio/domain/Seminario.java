package xavier.maratonajava.javacore.Gassociacao.exercicio.domain;



public class Seminario {
    private String titulo;
    private String endereco;
    private Professor professor;
    private Aluno[] alunos;

    public Seminario(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, String endereco, Professor professor) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.professor = professor;
    }

    public Seminario(String titulo, String endereco, Professor professor, Aluno[] alunos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void imprimir() {
        System.out.println("------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Endereco: " + this.endereco);
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        } else {
            System.out.println("Seminário ainda sem professor definido.");
        }
        if (this.alunos != null) {
            for (Aluno aluno : this.alunos) {
                System.out.println("Aluno: " + aluno.getNome());
            }
        }
        System.out.println("------------");

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }
}
