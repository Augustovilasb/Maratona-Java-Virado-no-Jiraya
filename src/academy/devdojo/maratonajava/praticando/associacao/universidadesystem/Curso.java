package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

import java.util.Arrays;

public class Curso {

    private String nome;
    private int duracao;
    private Aluno[] alunos;
    private Professor professor;
    private Sala sala;

    public Curso() {
    }

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public Curso(String nome, int duracao, Aluno[] alunos, Professor professor, Sala sala) {
        this.nome = nome;
        this.duracao = duracao;
        this.alunos = alunos;
        this.professor = professor;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "alunos=" + Arrays.toString(alunos) +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", professor=" + professor +
                ", sala=" + sala +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
