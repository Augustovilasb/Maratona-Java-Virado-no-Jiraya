package academy.devdojo.maratonajava.praticando.metodos.test;

import academy.devdojo.maratonajava.praticando.metodos.dominio.Aluno;
import java.util.ArrayList;

public class CheckAlunoService {

    public void printAprovados(ArrayList<Aluno> alunoList) {
        double n = 0;
        for (int i = 0; i < alunoList.size(); i++) {
            n = alunoList.get(i).nota;
            if (n >= 7) {
                System.out.println(alunoList.get(i).nome + " Aprovado, com nota: " + alunoList.get(i).nota);
            } else if (n >= 5) {
                System.out.println(alunoList.get(i).nome + " Aluno em recuperação, com nota: " + alunoList.get(i).nota);
            } else {
                System.out.println(alunoList.get(i).nome + " Aluno reprovado, com nota: " + alunoList.get(i).nota);
            }
        }
    }

    public void printHigher(ArrayList<Aluno> alunoList) {
        double maior = 0;
        double n = 0;
        String nameAluno = " ";
        for (int i = 0; i < alunoList.size(); i++) {
            if (n <= alunoList.get(i).nota) {
                n = alunoList.get(i).nota;
                if (maior < n) {
                    maior = n;
                    nameAluno = alunoList.get(i).nome;
                }
            }
        }
        System.out.println(nameAluno + " com nota: " + maior + ", PARABÉNS!!!");
    }

    public void contApproved(ArrayList<Aluno> alunoList) {
        int approved = 0;
        double n = 0;
        for (int i = 0; i < alunoList.size(); i++) {
            n = alunoList.get(i).nota;
            if (n >= 7) {
                approved++;
            }
        }
        System.out.println("Quantidade de alunos aprovados é: " + approved);
    }
}