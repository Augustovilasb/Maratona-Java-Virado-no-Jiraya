package academy.devdojo.maratonajava.javacore.teste;

import academy.devdojo.maratonajava.javacore.Aintroduclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------------------");

        estudante2.nome = "jeje";

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
