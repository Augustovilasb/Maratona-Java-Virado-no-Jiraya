package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("58 Rathmines Road Upper");
        endereco.setCep("D06-DF20");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Antonio Correa");
        pessoa.setCpf("117.535.896-73");

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Meme Rathmines Road Upper");
        endereco2.setCep("D06-DF20");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Geraldo Correa");
        pessoa2.setCpf("119.535.896-73");

        pessoa.setEndereco(endereco);
        pessoa2.setEndereco(endereco2);

        System.out.println(" ");
        System.out.println("--------------------------");

        pessoa.imprime();
        System.out.println("--------------------------");
        pessoa2.imprime();

        Funcionario funcionario =new Funcionario();
        funcionario.setNome("Sirley Vilas Boas");
        funcionario.setCpf("365.896.752-215");

        Endereco enderecoFuncionario = new Endereco();
        enderecoFuncionario.setRua("Rua Benedito Cabral Rennó");
        enderecoFuncionario.setCep("47380-000");

        funcionario.setEndereco(enderecoFuncionario);
        funcionario.setSalario(15000);

        System.out.println("--------------------------");
        funcionario.imprime();
        System.out.println("--------------------------");
        funcionario.relatorioPagemento();
        System.out.println("--------------------------");
        System.out.println(" ");
    }
}