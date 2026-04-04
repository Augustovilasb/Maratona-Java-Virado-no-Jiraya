package academy.devdojo.maratonajava.praticando.associacao.academialuta;

import academy.devdojo.maratonajava.praticando.associacao.academialuta.Turma;

public class AcademiaService {
    public static void main(String[] args) {

        Turma turmaA = new Turma("Turma A", 7);
        Turma turmaB = new Turma("Turma B", 14);
        Turma turmaC = new Turma("Turma C", 20);

        Professor professorA = new Professor("Professor DUDE", "Faixa Marrom");
        Professor professorB = new Professor("Professor ZIKA", "Faixa Marrom");
        Professor professorC = new Professor("Professor DON", "Faixa Black");

        Sala sala1 = new Sala(1, 7);
        Sala sala2 = new Sala(2, 7);
        Sala sala3 = new Sala(3, 12);

        Aluno aluno1 = new Aluno("Joaozinho", 14);
        Aluno aluno2 = new Aluno("Zezinho", 34);
        Aluno aluno3 = new Aluno("Matheuzinho", 24);
        Aluno aluno4 = new Aluno("Gabrielzinho", 55);
        Aluno aluno5 = new Aluno("Adaltinho", 53);
        Aluno aluno6 = new Aluno("Abacate", 34);
        Aluno aluno7 = new Aluno("Caramelo", 32);
        Aluno aluno8 = new Aluno("Tucho", 48);
        Aluno aluno9 = new Aluno("Jeka", 26);
        Aluno aluno10 = new Aluno("Abacate", 25);
        Aluno aluno11 = new Aluno("Zoice", 24);
        Aluno aluno12 = new Aluno("Zula", 42);
        Aluno aluno13 = new Aluno("Gabri", 11);
        Aluno aluno14 = new Aluno("Psycodelic", 66);
        Aluno aluno15 = new Aluno("Buba", 35);

        Aluno[] alunosturmaA = {aluno1, aluno2, aluno3, aluno4, aluno5};
        Aluno[] alunosturmaB = {aluno6, aluno7, aluno8, aluno9, aluno10};
        Aluno[] alunosturmaC = {aluno11, aluno12, aluno13, aluno14, aluno15};

        turmaA.setAlunos(alunosturmaA);
        turmaA.setProfessor(professorA);
//        turmaA.setHorario(turmaA.getHorario());
        turmaA.setSala(sala1);

        turmaB.setAlunos(alunosturmaB);
        turmaB.setProfessor(professorB);
//        turmaB.setHorario(turmaB.getHorario());
        turmaB.setSala(sala2);

        turmaC.setAlunos(alunosturmaC);
        turmaC.setProfessor(professorC);
//        turmaC.setHorario(turmaC.getHorario());
        turmaC.setSala(sala3);

        turmaA.imprime();
        turmaB.imprime();
        turmaC.imprime();

    }
}