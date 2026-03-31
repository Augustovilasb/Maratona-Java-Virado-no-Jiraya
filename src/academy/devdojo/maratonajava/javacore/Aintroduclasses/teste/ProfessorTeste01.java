package academy.devdojo.maratonajava.javacore.teste;

import academy.devdojo.maratonajava.javacore.Aintroduclasses.dominio.Professor;

public class ProfessorTeste01 {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nomeProfessor = "Ailton";
        professor.idadeProfessor = 43;
        professor.sexoProfessor = 'M';

        System.out.println("Novo professor " + professor.nomeProfessor + " de idade " + professor.idadeProfessor + " anos do sexo " + professor.sexoProfessor);
    }
}