package academy.devdojo.maratonajava.praticando.associacao.musicstream;

import java.util.List;
import java.util.Scanner;

public class Service {

    private List<Owner> owners;
    private List<Playlist> playlistList;
    private List<Music> musicList;

    public void playlistsByOwner() {
        if (playlistList == null) return;
        for (Owner owner : owners) {
            System.out.println("The " + owner.getName() + " have these Playlists: " + owner.getPlaylistList());
        }
    }

    public void searchingPlaylistByMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da música: ");
        String nome = scanner.nextLine();

        if (musicList == null) return;
        for (Music music : musicList) {
            if (music.getTitle().equalsIgnoreCase(nome)) {
                System.out.println("The music " + music.getTitle() + " is part of " + music.getPlaylist().getName() + " Playlist.");
            return;
            }
        }
        System.out.println("Música não encontrada.");
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    public void setPlaylistList(List<Playlist> playlistList) {
        this.playlistList = playlistList;
    }
}
