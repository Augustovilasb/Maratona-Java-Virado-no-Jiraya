package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Jose";
        estudante1.sexo = 'M';
        estudante1.idade = 16;

        estudante2.nome = "Makito";
        estudante2.sexo = 'M';
        estudante2.idade = 23;

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
