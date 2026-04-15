package academy.devdojo.maratonajava.praticando.associacao.musicstream;

public class Music {

    private String title;
    private double musicDurarion;
    private Playlist playlist;


    public Music(String title, double musicDurarion) {
        this.title = title;
        this.musicDurarion = musicDurarion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMusicDurarion() {
        return musicDurarion;
    }

    public void setMusicDurarion(double musicDurarion) {
        this.musicDurarion = musicDurarion;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
