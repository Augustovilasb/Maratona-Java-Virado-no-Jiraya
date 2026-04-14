package academy.devdojo.maratonajava.praticando.associacao.escolaapp;

public class Aluno {

    private String nome;
    private double matricula;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
