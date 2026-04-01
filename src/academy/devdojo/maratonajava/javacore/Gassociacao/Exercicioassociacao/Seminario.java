package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao;

public class Seminario {

    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Professor professor, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
        this.alunos = alunos;
    }


    public Aluno[] getAlunos() {return alunos;}
    public void setAlunos(Aluno[] alunos) {this.alunos = alunos;}
    public Local getLocal() {return local;}
    public void setLocal(Local local) {this.local = local;}
    public Professor getProfessor() {return professor;}
    public void setProfessor(Professor professor) {this.professor = professor;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
}
