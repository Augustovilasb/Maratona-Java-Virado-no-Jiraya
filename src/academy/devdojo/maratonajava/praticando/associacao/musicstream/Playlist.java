package academy.devdojo.maratonajava.praticando.associacao.musicstream;

import academy.devdojo.maratonajava.praticando.associacao.escolaapp.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private Owner owner;
    private List<Music> musicsList;

    public Playlist(String name, String owner) {
        this.name = name;
        this.musicsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  Playlist: " + name + "\n");
        for (Music music : musicsList) {
            sb.append("    - " + music.getTitle() + " - " + music.getMusicDurarion() + "\n");
        }
        return sb.toString();
    }

    public void adicionarMusic(Music music) {
        music.setPlaylist(this);
        musicsList.add(music);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Music> getMusics() {
        return musicsList;
    }

    public void setMusics(List<Music> musicsList) {
        this.musicsList = musicsList;
    }
}
