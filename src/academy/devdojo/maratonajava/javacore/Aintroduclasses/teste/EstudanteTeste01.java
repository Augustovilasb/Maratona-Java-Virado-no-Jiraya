package academy.devdojo.maratonajava.javacore.teste;

import academy.devdojo.maratonajava.javacore.Aintroduclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.idade = 33;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
