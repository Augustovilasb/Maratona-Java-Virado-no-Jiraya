package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.ImpressoraProfessor;
import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Professor;

public class ProfessorTeste02 {
    public static void main(String[] args) {

        Professor professorFisica = new Professor();
        Professor professorCalculo = new Professor();
        Professor professorResistenciaDosMateriais = new Professor();
        Professor professorFenomenoDosTransportes = new Professor();
        ImpressoraProfessor impressora = new ImpressoraProfessor();

        professorFisica.name = "Mario Victor";
        professorFisica.idade = 43;
        professorFisica.faculdade = "UNIFEI";
        professorFisica.materia = "Física 3";

        professorCalculo.name = "Nivaldo";
        professorCalculo.idade = 39;
        professorCalculo.faculdade = "UNIFEI";
        professorCalculo.materia = "Calculo 2";

        professorResistenciaDosMateriais.name = "Thiago";
        professorResistenciaDosMateriais.idade = 37;
        professorResistenciaDosMateriais.faculdade = "UNIFEI";
        professorResistenciaDosMateriais.materia = "Resistencia dos Materiais";

        professorFenomenoDosTransportes.name = "Leopoldo";
        professorFenomenoDosTransportes.idade = 45;
        professorFenomenoDosTransportes.faculdade = "UNIFEI";
        professorFenomenoDosTransportes.materia = "Fenomeno Dos Transportes";


        // IMPRIMINDO DIRETO DA CLASSE IMPRESSORAPROFESSOR
        System.out.println("--------------------------------------------------------------------------------------");
        impressora.imprimeProfessor(professorCalculo);
        impressora.imprimeProfessor(professorFisica);
        impressora.imprimeProfessor(professorFenomenoDosTransportes);
        impressora.imprimeProfessor(professorResistenciaDosMateriais);

        // IMPRIMINDO DIRETO DA CLASSE PROFESSOR COM O THIS
        professorFisica.imprimeDados();
        professorCalculo.imprimeDados();
        professorResistenciaDosMateriais.imprimeDados();
        professorFenomenoDosTransportes.imprimeDados();
    }
}
