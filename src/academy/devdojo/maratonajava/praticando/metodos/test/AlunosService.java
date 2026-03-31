package academy.devdojo.maratonajava.praticando.metodos.test;

import academy.devdojo.maratonajava.praticando.metodos.dominio.AlunoDomain;
import academy.devdojo.maratonajava.praticando.metodos.dominio.Alunos;

public class AlunosService {
    public static void main(String[] args) {

        Alunos aluno01 = new Alunos();
        Alunos aluno02 = new Alunos();
        AlunoDomain print = new AlunoDomain();

        aluno01.nome = "João";
        aluno02.nome = "Sidão";
        aluno01.grades = new double[] {23,43,63,12};
        aluno02.grades = new double[] {22,33,68,16};

        print.printAluno(aluno01);
        print.avgGradesAluno(aluno01);
        print.printAluno(aluno02);
        print.avgGradesAluno(aluno02);

    }
}
