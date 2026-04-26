package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static void main(String[] args) {

        List<Game> gameList = new ArrayList<>();
        List<Studio> studioList = new ArrayList<>();
        List<Player> playerList = new ArrayList<>();

        Platform platform = new Platform("GG GameGeneration", studioList, playerList, gameList);

        StudioAAA studioAAA = new StudioAAA("Studio TCH", gameList, 100.000);
        StudioIndependent studioIndependent = new StudioIndependent("Studio TCH2K", gameList, 15);
        studioList.add(studioAAA);
        studioList.add(studioIndependent);

        Game counterStrike = new Game("Counter Strike 1.6", TypeGames.FPS, studioIndependent);
        Game berserker = new Game("Berserk Dark", TypeGames.RPG, studioAAA);
        Game gtaV = new Game("GTA V", TypeGames.RPG, studioIndependent);
        gameList.add(counterStrike);
        gameList.add(berserker);
        gameList.add(gtaV);

        Player tch = new Player("TCH", counterStrike);
        Player lnzin = new Player("LNZIN", counterStrike);
        Player nick = new Player("NICK", gtaV);
        Player talko = new Player("TALKO", berserker);
        Player silvinho = new Player("SILVINHO", gtaV);
        playerList.add(tch);
        playerList.add(lnzin);
        playerList.add(talko);
        playerList.add(nick);
        playerList.add(silvinho);

        tch.setGame(counterStrike);
        lnzin.setGame(counterStrike);
        nick.setGame(gtaV);
        talko.setGame(berserker);
        silvinho.setGame(gtaV);

        counterStrike.setStudio(studioIndependent);
        berserker.setStudio(studioAAA);
        gtaV.setStudio(studioIndependent);

        System.out.println(platform);

        System.out.println("---------------------- LIVE SEARCH ---------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Searching playing CS 1.6 now: ");
        platform.searchPlayerByGame(counterStrike);
        System.out.println("--------------------------------------------------------");
        System.out.println("Searching playing Berserker now: ");
        platform.searchPlayerByGame(berserker);
        System.out.println("--------------------------------------------------------");
        System.out.println("Searching playing GTA V now: ");
        platform.searchPlayerByGame(gtaV);
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println(" ");

        System.out.println(TypeGames.findGameByType("FPS"));
        System.out.println(TypeGames.findGameByType("RPG"));
        System.out.println(TypeGames.findGameByType("INDI"));
        System.out.println(TypeGames.findGameByValue(1));
        System.out.println(TypeGames.findGameByValue(2));
        System.out.println(TypeGames.findGameByValue(3));

    }
}
