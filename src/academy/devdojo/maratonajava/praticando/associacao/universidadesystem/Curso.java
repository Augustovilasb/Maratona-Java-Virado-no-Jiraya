package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

import academy.devdojo.maratonajava.praticando.associacao.universidadesystem.Aluno;

public class Curso {

    private String nome;
    private int duracao;
    private Aluno[] alunos;
    private Professor professor;
    private Sala sala;
    private Universidade universidade;

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

    public void imprime() {

        System.out.println(" ");
        System.out.println("############################################");
        System.out.println(" WELCOME TO " + universidade.getNome());
        System.out.println(" LOCATION AT: " + universidade.getCidade());
        System.out.println("############################################");
        System.out.println("CURRENTLY WE HAVE THE FOLLOWING CURSES: ");
        System.out.println(this.nome + ", com professor: " + professor.getNome() + "\n" +
                "Especialista em: " + professor.getTitulacao() + " e duração de: " + this.duracao + " ano.");
            System.out.println("Curso " + this.nome + ", será realizado na sala: " + sala.getNumero() + ", no andar: " + sala.getAndar());
        System.out.println("############################################");
        System.out.println("ALUNOS CADASTRADOS E RESPECTIVOS CURSOS: ");
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso().getNome() + ", N Matrícula: " + aluno.getMatricula());
        }
        System.out.println("############################################");
        System.out.println(" ");
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

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }


}