package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(Carro.MAX_SPEED);
        System.out.println(carro.MIN_SPEED);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Nokima Torugo");
        ferrari.imprime();
    }
}
