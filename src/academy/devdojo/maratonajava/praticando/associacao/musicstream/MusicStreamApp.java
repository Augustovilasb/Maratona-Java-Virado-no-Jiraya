package academy.devdojo.maratonajava.praticando.associacao.musicstream;

import java.util.ArrayList;
import java.util.List;

public class MusicStreamApp {
    public static void main(String[] args) {

        MusicPlatform plataform = new MusicPlatform("TCH Music");

        List<Owner> ownersList = new ArrayList<>();
        ownersList.add(new Owner("Diego Faria", "Drako"));
        ownersList.add(new Owner("Julio Beligni", "Juju"));
        ownersList.add(new Owner("Raimundo Fagner", "Fagner"));

        List<Playlist> playlistList = new ArrayList<>();
        playlistList.add(new Playlist("Chuva da noite", "Diego Faria"));
        playlistList.add(new Playlist("Cavalo de Troia", "Diego Faria"));
        playlistList.add(new Playlist("Carro sem Freio", "Diego Faria"));
        playlistList.add(new Playlist("Sofa de hospital", "Diego Faria"));
        playlistList.add(new Playlist("Canal 4", "Julio Beligni"));
        playlistList.add(new Playlist("Fogete com Charrete", "Julio Beligni"));
        playlistList.add(new Playlist("Shakironil", "Julio Beligni"));
        playlistList.add(new Playlist("Amigo da Cantina", "Julio Beligni"));
        playlistList.add(new Playlist("Só ando de Camelo", "Julio Beligni"));
        playlistList.add(new Playlist("Bike de motor", "Julio Beligni"));
        playlistList.add(new Playlist("Quem dera ser um peixe", "Raimundo Fagner"));
        playlistList.add(new Playlist("Borbulhas de amor", "Raimundo Fagner"));
        playlistList.add(new Playlist("Cabelos ao vento", "Raimundo Fagner"));
        playlistList.add(new Playlist("Vem comigo", "Raimundo Fagner"));

        List<Music> musicList = new ArrayList<>();
        //Play list Drako
        // Chuva da noite
        musicList.add(new Music("Chuva e Vento", 213));
        musicList.add(new Music("Noite Fria", 187));
        musicList.add(new Music("Temporal", 245));
        // Cavalo de Troia
        musicList.add(new Music("Guerra Antiga", 301));
        musicList.add(new Music("Espada de Madeira", 198));
        musicList.add(new Music("Muralha", 267));
        // Carro sem Freio
        musicList.add(new Music("Velocidade", 223));
        musicList.add(new Music("Estrada Longa", 289));
        musicList.add(new Music("Freio de Mão", 176));
        // Sofa de hospital
        musicList.add(new Music("Espera", 312));
        musicList.add(new Music("Corredor Vazio", 201));
        musicList.add(new Music("Alta Médica", 234));

        //Play list Juju
        // Canal 4
        musicList.add(new Music("Sinal Aberto", 189));
        musicList.add(new Music("Estática", 256));
        musicList.add(new Music("Ao Vivo", 298));
        // Fogete com Charrete
        musicList.add(new Music("Poeira do Sertão", 214));
        musicList.add(new Music("Tropeiro", 267));
        musicList.add(new Music("Charrete Velha", 183));
        // Shakironil
        musicList.add(new Music("Dança do Ventre", 221));
        musicList.add(new Music("Quadril", 198));
        musicList.add(new Music("Ritmo Latino", 245));
        // Amigo da Cantina
        musicList.add(new Music("Boteco", 234));
        musicList.add(new Music("Mesa do Fundo", 189));
        musicList.add(new Music("Conta do Bar", 212));
        // Só ando de Camelo
        musicList.add(new Music("Deserto", 278));
        musicList.add(new Music("Oásis", 301));
        musicList.add(new Music("Corcova", 167));
        // Bike de motor
        musicList.add(new Music("Acelerada", 198));
        musicList.add(new Music("Escapamento", 223));
        musicList.add(new Music("Pneu Furado", 245));

        //Play list Fagner
        // Quem dera ser um peixe
        musicList.add(new Music("Fundo do Mar", 289));
        musicList.add(new Music("Coral", 213));
        musicList.add(new Music("Maré Alta", 234));
        // Borbulhas de amor
        musicList.add(new Music("Espuma", 201));
        musicList.add(new Music("Mergulho", 267));
        musicList.add(new Music("Fundo do Coração", 312));
        // Cabelos ao vento
        musicList.add(new Music("Brisa", 178));
        musicList.add(new Music("Ventania", 234));
        musicList.add(new Music("Calmaria", 256));
        // Vem comigo
        musicList.add(new Music("Mão na Mão", 223));
        musicList.add(new Music("Caminho", 189));
        musicList.add(new Music("Junto", 245));

        plataform.setOwnersList(ownersList);
        plataform.setPlaylistList(playlistList);

        ownersList.get(0).adicionarPlaylist(playlistList.get(0));
        ownersList.get(0).adicionarPlaylist(playlistList.get(1));
        ownersList.get(0).adicionarPlaylist(playlistList.get(2));
        ownersList.get(0).adicionarPlaylist(playlistList.get(3));
        ownersList.get(1).adicionarPlaylist(playlistList.get(4));
        ownersList.get(1).adicionarPlaylist(playlistList.get(5));
        ownersList.get(1).adicionarPlaylist(playlistList.get(6));
        ownersList.get(1).adicionarPlaylist(playlistList.get(7));
        ownersList.get(1).adicionarPlaylist(playlistList.get(8));
        ownersList.get(1).adicionarPlaylist(playlistList.get(9));
        ownersList.get(2).adicionarPlaylist(playlistList.get(10));
        ownersList.get(2).adicionarPlaylist(playlistList.get(11));
        ownersList.get(2).adicionarPlaylist(playlistList.get(12));
        ownersList.get(2).adicionarPlaylist(playlistList.get(13));

        // Drako Musics
        playlistList.get(0).adicionarMusic(musicList.get(0));
        playlistList.get(0).adicionarMusic(musicList.get(1));
        playlistList.get(0).adicionarMusic(musicList.get(2));
        playlistList.get(1).adicionarMusic(musicList.get(3));
        playlistList.get(1).adicionarMusic(musicList.get(4));
        playlistList.get(1).adicionarMusic(musicList.get(5));
        playlistList.get(2).adicionarMusic(musicList.get(6));
        playlistList.get(2).adicionarMusic(musicList.get(7));
        playlistList.get(2).adicionarMusic(musicList.get(8));
        playlistList.get(3).adicionarMusic(musicList.get(9));
        playlistList.get(3).adicionarMusic(musicList.get(10));
        playlistList.get(3).adicionarMusic(musicList.get(11));

        // Juju Musics
        playlistList.get(4).adicionarMusic(musicList.get(12));
        playlistList.get(4).adicionarMusic(musicList.get(13));
        playlistList.get(4).adicionarMusic(musicList.get(14));
        playlistList.get(5).adicionarMusic(musicList.get(15));
        playlistList.get(5).adicionarMusic(musicList.get(16));
        playlistList.get(5).adicionarMusic(musicList.get(17));
        playlistList.get(6).adicionarMusic(musicList.get(18));
        playlistList.get(6).adicionarMusic(musicList.get(19));
        playlistList.get(6).adicionarMusic(musicList.get(20));
        playlistList.get(7).adicionarMusic(musicList.get(21));
        playlistList.get(7).adicionarMusic(musicList.get(22));
        playlistList.get(7).adicionarMusic(musicList.get(23));
        playlistList.get(8).adicionarMusic(musicList.get(24));
        playlistList.get(8).adicionarMusic(musicList.get(25));
        playlistList.get(8).adicionarMusic(musicList.get(26));
        playlistList.get(9).adicionarMusic(musicList.get(27));
        playlistList.get(9).adicionarMusic(musicList.get(28));
        playlistList.get(9).adicionarMusic(musicList.get(29));

        // Fagner Musics
        playlistList.get(10).adicionarMusic(musicList.get(30));
        playlistList.get(10).adicionarMusic(musicList.get(31));
        playlistList.get(10).adicionarMusic(musicList.get(32));
        playlistList.get(11).adicionarMusic(musicList.get(33));
        playlistList.get(11).adicionarMusic(musicList.get(34));
        playlistList.get(11).adicionarMusic(musicList.get(35));
        playlistList.get(12).adicionarMusic(musicList.get(36));
        playlistList.get(12).adicionarMusic(musicList.get(37));
        playlistList.get(12).adicionarMusic(musicList.get(38));
        playlistList.get(13).adicionarMusic(musicList.get(39));
        playlistList.get(13).adicionarMusic(musicList.get(40));
        playlistList.get(13).adicionarMusic(musicList.get(41));

        Service service = new Service();
        service.setOwners(ownersList);
        service.setMusicList(musicList);
        service.setPlaylistList(playlistList);

        System.out.println(plataform);
        service.playlistsByOwner();
        service.searchingPlaylistByMusic();

    }
}
