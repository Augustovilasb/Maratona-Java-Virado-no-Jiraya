package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Player;

public class PlayerExercise {

    public static void main(String[] args) {

        Player player = new Player();

        player.name = "Neymar";
        player.age = 31;
        player.salaries = new double[] {1000000,2000000,3000000};

        player.print();
        player.printAvgSalary();
    }
}