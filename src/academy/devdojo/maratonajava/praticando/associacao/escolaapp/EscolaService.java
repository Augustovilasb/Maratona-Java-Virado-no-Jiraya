package academy.devdojo.maratonajava.praticando.associacao.escolaapp;

import java.util.ArrayList;
import java.util.List;

public class EscolaService {
    public static void main(String[] args) {

        Escola escola = new Escola("João XXIII");

        List<Turma> turmas = new ArrayList<>();
        turmas.add(new Turma("TA", "Engenharia"));
        turmas.add(new Turma("TB", "Veterinária"));
        turmas.add(new Turma("TC", "Medicina"));
        turmas.add(new Turma("TD", "Geografia"));
        turmas.add(new Turma("TE", "História"));

        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Gege", "Engenheiro"));
        professores.add(new Professor("Dudu", "Veterinária"));
        professores.add(new Professor("Kaka", "Medicina"));
        professores.add(new Professor("Tete", "Geografia"));
        professores.add(new Professor("Tutu", "História"));

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("jOn@s", 8656));
        alunos.add(new Aluno("tch", 9513));
        alunos.add(new Aluno("luanzin", 8325));
        alunos.add(new Aluno("turtoise", 7536));
        alunos.add(new Aluno("psycodelic", 8526));
        alunos.add(new Aluno("Gabri", 7413));
        alunos.add(new Aluno("plant", 1478));
        alunos.add(new Aluno("guga", 3216));

        turmas.get(0).setProfessor(professores.get(0));
        turmas.get(1).setProfessor(professores.get(1));
        turmas.get(2).setProfessor(professores.get(2));
        turmas.get(3).setProfessor(professores.get(3));
        turmas.get(4).setProfessor(professores.get(4));

        turmas.get(0).adicionarAluno(alunos.get(0));
        turmas.get(0).adicionarAluno(alunos.get(1));
        turmas.get(1).adicionarAluno(alunos.get(2));
        turmas.get(1).adicionarAluno(alunos.get(3));
        turmas.get(2).adicionarAluno(alunos.get(4));
        turmas.get(2).adicionarAluno(alunos.get(5));
        turmas.get(3).adicionarAluno(alunos.get(6));
        turmas.get(4).adicionarAluno(alunos.get(7));

        escola.setTurmaList(turmas);

        System.out.println(escola);
    }
}
