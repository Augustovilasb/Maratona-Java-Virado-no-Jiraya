package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

public class ImpressoraProfessor {

    public void imprimeProfessor(Professor professor) {

        System.out.println("Nome: " + professor.name +", Idade: " + professor.idade + " anos, Matéria: " + professor.materia + ", Faculdade: " + professor.faculdade);
        System.out.println("--------------------------------------------------------------------------------------");

    }
}