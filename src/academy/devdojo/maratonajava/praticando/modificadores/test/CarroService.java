package academy.devdojo.maratonajava.praticando.modificadores.test;

import academy.devdojo.maratonajava.praticando.modificadores.dominio.Carro;

public class CarroService {

    public void criaCarros() {

        Carro carro1 = new Carro("G5", 7);
        Carro carro2 = new Carro("i30", 6);
        carro2.setQntMarcha(9);
        carro1.setModelo("Punto");
        Carro.velocidadeMax = 260;

        System.out.println(carro1);
        System.out.println(carro2);

    }
}