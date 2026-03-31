package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String genero;
    private String name;
    private String tipo;
    private int qntEpisodios;

    public Anime(String genero, String name, String tipo, int qntEpisodios) {
        this();
        this.genero = genero;
        this.name = name;
        this.tipo = tipo;
        this.qntEpisodios = qntEpisodios;
    }

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Género do Anime: " + genero + ", Name do Anime: " + name + ", Tipo do Anime: " + tipo + ", Quantidade de episódios do Anime: " + qntEpisodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int qntEpisodios() {
        return qntEpisodios;
    }

    public void setqntEpisodios(int qntEpisodios) {
        this.qntEpisodios = qntEpisodios;
    }
}
