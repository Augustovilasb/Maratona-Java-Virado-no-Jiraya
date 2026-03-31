package academy.devdojo.maratonajava.javacore.teste;

import academy.devdojo.maratonajava.javacore.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro.nome = "Golf";
        carro.marca = "Volkswagen";
        carro.ano = 2007;
        carro2.nome = "Clio";
        carro2.marca = "Renou";
        carro2.ano = 2002;
        carro3.nome = "Fiesta";
        carro3.marca = "Ford";
        carro3.ano = 2004;

        carro3 = carro;
        carro = carro2;

        System.out.println("Carro numero 1: " + carro.nome + " " + carro.marca + " " + carro.ano);
        System.out.println("Carro numero 2: " + carro2.nome + " " + carro2.marca + " " + carro2.ano);
        System.out.println("Carro numero 3: " + carro3.nome + " " + carro3.marca + " " + carro3.ano);
    }
}