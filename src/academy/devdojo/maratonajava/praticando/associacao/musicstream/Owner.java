package academy.devdojo.maratonajava.praticando.associacao.musicstream;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    private String nickname;
    private List<Playlist> playlistList;

    public Owner(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.playlistList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner: " + getName() + " - Apelido: " + getNickname() + "\n");
        for (Playlist playlist : playlistList) {
            sb.append(playlist.toString());
        }
        return sb.toString();
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlistList.add(playlist);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    public void setPlaylistList(List<Playlist> playlistList) {
        this.playlistList = playlistList;
    }
}
