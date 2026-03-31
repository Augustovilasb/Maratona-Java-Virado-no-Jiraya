package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setName("Jyraia");
        pessoa.setIdade(135);

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getIdade());
    }
}