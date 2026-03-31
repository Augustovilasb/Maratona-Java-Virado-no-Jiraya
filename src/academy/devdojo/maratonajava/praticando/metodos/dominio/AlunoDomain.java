package academy.devdojo.maratonajava.praticando.metodos.dominio;

public class AlunoDomain {

    public void printAluno(Alunos alunos) {
        System.out.println("Nome do Aluno: " + alunos.nome);
//        System.out.println("Grades Semestral do Aluno: " + Arrays.toString(alunos.grades));
        for (double grade : alunos.grades) {
            System.out.println(grade);
        }
    }

    public void avgGradesAluno(Alunos alunos) {
        double avg = 0;
        for (double grade : alunos.grades) {
            avg += grade;
        }
        avg /= alunos.grades.length;
        System.out.println("Grades Average is: " + avg);
    }

}