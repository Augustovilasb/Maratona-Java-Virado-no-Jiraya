package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios;

    public Anime(String nome){
        this.nome = nome;
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anime: ").append(nome).append("\n");
        for (int episodio : episodios) {
            sb.append("Episódio: ").append(episodio).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int qntEpisodios) {
        this.episodios = new int[qntEpisodios];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
}