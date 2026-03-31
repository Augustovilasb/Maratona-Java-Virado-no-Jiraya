package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Ação", "Titan Attack", "TV", 74);
        Anime anime2 = new Anime("Romance", "Naruto Gay", "Netflix", 14);
        Anime anime3 = new Anime("DBZ");
        System.out.println("---------------------------");
        System.out.println(anime);
        System.out.println("---------------------------");
        System.out.println(anime2);
        System.out.println("---------------------------");
        System.out.println(anime3);
    }
}