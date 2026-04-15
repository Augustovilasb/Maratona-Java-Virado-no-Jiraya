package academy.devdojo.maratonajava.praticando.associacao.musicstream;

import java.util.List;

public class MusicPlatform {

    private String name;
    private List<Playlist> playlistList;
    private List<Owner> ownersList;

    public MusicPlatform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("-------- WELCOME TO " + this.name + "\n");
        for (Owner owner : ownersList) {
            sb.append(owner.toString());
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Owner> getOwnersList() {
        return ownersList;
    }

    public void setOwnersList(List<Owner> ownersList) {
        this.ownersList = ownersList;
    }

    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    public void setPlaylistList(List<Playlist> playlistList) {
        this.playlistList = playlistList;
    }
}
