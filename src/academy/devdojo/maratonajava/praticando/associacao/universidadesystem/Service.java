package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

public class Service {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[20];

        for (int i = 1; i < 20; i++) {

            Curso curso = new Curso();

            Aluno aluno = new Aluno();
            aluno.setNome("Aluno " + i);
            aluno.setMatricula(1000 + i);
            aluno.setCurso(curso);

            alunos[i] = aluno;
        }
            if (alunos[0] == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
            }

    }
}
