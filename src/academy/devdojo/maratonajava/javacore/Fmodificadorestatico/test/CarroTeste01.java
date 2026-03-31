package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Car;

public class CarroTeste01 {

    public static void main(String[] args) {

        Car c1 = new Car("BMW", 350);
        Car c2 = new Car("Mercedes", 280);
        Car c3 = new Car("Volvo", 300);

        Car.limitedSpeed = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();



    }
}