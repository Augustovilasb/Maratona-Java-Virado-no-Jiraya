package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ");
        anime.setNome("Jack Chan");
        anime.setEpisodios(300);
        System.out.println(anime);
    }
}