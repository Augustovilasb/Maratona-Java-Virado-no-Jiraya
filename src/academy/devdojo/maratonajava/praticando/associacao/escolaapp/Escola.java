package academy.devdojo.maratonajava.praticando.associacao.escolaapp;

import java.util.List;

public class Escola {

    private String nome;
    private List<Turma> turmaList;
    private List<Professor> professor;
    private List<Aluno> alunoList;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, List<Turma> turmaList) {
        this.nome = nome;
        this.turmaList = turmaList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=============================\n");
        sb.append("Escola: " + nome + "\n");
        sb.append("=============================\n");
        for (Turma turma : turmaList) {
            sb.append(turma.toString());
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmaList() {
        return turmaList;
    }

    public void setTurmaList(List<Turma> turmaList) {
        this.turmaList = turmaList;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }
}
