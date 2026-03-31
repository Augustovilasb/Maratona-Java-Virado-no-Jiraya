package academy.devdojo.maratonajava.praticando.metodos.dominio;

import academy.devdojo.maratonajava.praticando.metodos.test.CheckAlunoService;

import java.util.ArrayList;

public class CheckAluno {
    public static void main(String[] args) {

        ArrayList<Aluno> alunoList = new ArrayList<>();
        CheckAlunoService printData = new CheckAlunoService();

        alunoList.add(new Aluno("Ana", "Silva", 2021, 8.5));
        alunoList.add(new Aluno("Bruno", "Oliveira", 2020, 4.0));
        alunoList.add(new Aluno("Carla", "Santos", 2022, 6.5));
        alunoList.add(new Aluno("Diego", "Pereira", 2019, 9.0));
        alunoList.add(new Aluno("Eva", "Costa", 2021, 3.5));
        alunoList.add(new Aluno("Felipe", "Rodrigues", 2023, 7.2));
        alunoList.add(new Aluno("Gabriela", "Ferreira", 2020, 5.8));
        alunoList.add(new Aluno("Henrique", "Alves", 2022, 9.5));
        alunoList.add(new Aluno("Isabela", "Nascimento", 2021, 6.0));
        alunoList.add(new Aluno("João", "Lima", 2019, 4.5));
        alunoList.add(new Aluno("Karina", "Araújo", 2023, 8.0));
        alunoList.add(new Aluno("Lucas", "Carvalho", 2020, 7.5));
        alunoList.add(new Aluno("Mariana", "Gomes", 2022, 3.0));
        alunoList.add(new Aluno("Nicolas", "Martins", 2021, 9.8));
        alunoList.add(new Aluno("Olivia", "Rocha", 2019, 5.5));
        alunoList.add(new Aluno("Paulo", "Dias", 2023, 6.8));
        alunoList.add(new Aluno("Quésia", "Fernandes", 2020, 7.0));
        alunoList.add(new Aluno("Rafael", "Ribeiro", 2022, 4.2));
        alunoList.add(new Aluno("Sabrina", "Pinto", 2021, 8.8));
        alunoList.add(new Aluno("Thiago", "Moreira", 2019, 5.0));
        alunoList.add(new Aluno("Ursula", "Barbosa", 2023, 7.8));
        alunoList.add(new Aluno("Victor", "Cardoso", 2020, 6.2));
        alunoList.add(new Aluno("Wanda", "Correia", 2022, 9.2));
        alunoList.add(new Aluno("Xavier", "Mendes", 2021, 3.8));
        alunoList.add(new Aluno("Yasmin", "Nunes", 2019, 8.2));
        alunoList.add(new Aluno("Zeca", "Cavalcanti", 2023, 5.2));
        // imprimindo a lista toda
        System.out.println("####################################################################################");
        System.out.println("Aqui temos a lista de todos os alunos e suas respectivas notas: ");
        printData.printAprovados(alunoList);
        System.out.println("####################################################################################");
        // imprimindo apenas a maior nota
        System.out.println("Esse é o aluno com maior nota do ano: ");
        printData.printHigher(alunoList);
        System.out.println("####################################################################################");
        // imprimindo qnt de alunos aprovados
        System.out.println("Essa é a qnt de alunos aprovados: ");
        printData.contApproved(alunoList);
        System.out.println("####################################################################################");
    }
}