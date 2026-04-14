package academy.devdojo.maratonajava.praticando.associacao.escolaapp;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private String disciplina;
    private Professor professor;
    private List<Aluno> alunoList;
    private Escola escola;

    public Turma(String codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunoList = new ArrayList<>();
    }

    public Turma(String codigo, String disciplina, Professor professor, List<Aluno> alunoList) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunoList = alunoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório das turmas: " + "\n");
        sb.append("Turma: " + this.getCodigo() + "\n");
        sb.append("Professor: ").append(professor.getNome());
        sb.append("Especialidade: ").append(professor.getEspecialidade()).append("\n");
            for (Aluno aluno : alunoList) {
                sb.append("Nome: ").append(aluno.getNome());
                sb.append(" Matricula: ").append(aluno.getMatricula()).append("\n");
            }
        return sb.toString();
    }

    public void adicionarAluno(Aluno aluno) {
        alunoList.add(aluno);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}
