package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao;

public class SeminarioService {
    public static void main(String[] args) {

        Local local = new Local("58 Rathmines Road Upper, Rathmines, Dublin 6, Dublin");
        Aluno aluno1 = new Aluno("José", 22);
        Aluno aluno2 = new Aluno("Joao", 33);
        Aluno aluno3 = new Aluno("Jota", 27);
        Aluno aluno4 = new Aluno("Jack", 23);
        Aluno aluno5 = new Aluno("Jason", 18);
        Aluno aluno6 = new Aluno("Jiraya", 99);
        Professor professor = new Professor("Douglas Plata", "BJJ");
        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};

        Seminario seminario = new Seminario("Became a BlackBelt", professor, local, alunos);

        Seminario[] seminarioDisponiveis = {seminario};

        professor.setSeminarios(seminarioDisponiveis);
        professor.imprime();
    }
}
