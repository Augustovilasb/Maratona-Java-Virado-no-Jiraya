package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void main(String[] args) {

        // Técnicos
        Tecnico tecnicoFuria = new Tecnico("Roberto Carlos", "Brasil");
        Tecnico tecnicoLiquid = new Tecnico("John Smith", "EUA");
        Tecnico tecnicoNavi = new Tecnico("Hiroshi Tanaka", "Japão");
        Tecnico tecnicoG2 = new Tecnico("Pierre Dupont", "França");

        // Organizadores
        Organizador org1 = new Organizador("Felipe Souza", "Brasil");
        Organizador org2 = new Organizador("Mike Johnson", "EUA");

        // Jogadores
        Jogador j1 = new Jogador("Gabriel Silva", "Gabs", "Brasil");
        Jogador j2 = new Jogador("Lucas Martins", "LucasFPS", "Brasil");
        Jogador j3 = new Jogador("Carlos Souza", "CarlosX", "Brasil");
        Jogador j4 = new Jogador("Pedro Alves", "PedroGG", "Brasil");
        Jogador j5 = new Jogador("João Costa", "JoãoKill", "Brasil");

        Jogador j6 = new Jogador("Tyler Smith", "TylerZ", "EUA");
        Jogador j7 = new Jogador("John Doe", "JohnFire", "EUA");
        Jogador j8 = new Jogador("Mike Brown", "MikeSnipe", "EUA");
        Jogador j9 = new Jogador("Chris Lee", "ChrisB", "EUA");
        Jogador j10 = new Jogador("Ryan Wilson", "RyanPro", "EUA");

        Jogador j11 = new Jogador("Yuki Tanaka", "YukiGod", "Japão");
        Jogador j12 = new Jogador("Kenji Yamamoto", "KenjiX", "Japão");
        Jogador j13 = new Jogador("Hiro Sato", "HiroFire", "Japão");
        Jogador j14 = new Jogador("Ryu Nakamura", "RyuKill", "Japão");
        Jogador j15 = new Jogador("Taro Suzuki", "TaroGG", "Japão");

        Jogador j16 = new Jogador("Pierre Martin", "PierreZ", "França");
        Jogador j17 = new Jogador("Jean Dupont", "JeanFire", "França");
        Jogador j18 = new Jogador("Louis Bernard", "LouisX", "França");
        Jogador j19 = new Jogador("Henri Petit", "HenriGG", "França");
        Jogador j20 = new Jogador("Marc Leroy", "MarcPro", "França");

        // Times
        List<Jogador> jogadoresFuria = new ArrayList<>(List.of(j1, j2, j3, j4, j5));
        List<Jogador> jogadoresLiquid = new ArrayList<>(List.of(j6, j7, j8, j9, j10));
        List<Jogador> jogadoresNavi = new ArrayList<>(List.of(j11, j12, j13, j14, j15));
        List<Jogador> jogadoresG2 = new ArrayList<>(List.of(j16, j17, j18, j19, j20));

        Time timeFuria = new Time("FURIA", tecnicoFuria);
        Time timeLiquid = new Time("Team Liquid", tecnicoLiquid);
        Time timeNavi = new Time("Natus Vincere", tecnicoNavi);
        Time timeG2 = new Time("G2 Esports", tecnicoG2);

        // Torneios
        List<Time> timesTorneio1 = new ArrayList<>(List.of(timeFuria, timeLiquid));
        List<Time> timesTorneio2 = new ArrayList<>(List.of(timeNavi, timeG2));

        Torneio torneio1 = new Torneio("IEM Katowice", "CS2", org1);
        Torneio torneio2 = new Torneio("ESL Pro League", "Valorant", org2);

        // Plataforma
        List<Torneio> torneios = new ArrayList<>(List.of(torneio1, torneio2));
        Plataforma plataforma = new Plataforma("ESL Gaming");


        //Setting tecnicos
        timeFuria.setTecnico(tecnicoFuria);
        timeLiquid.setTecnico(tecnicoLiquid);
        timeNavi.setTecnico(tecnicoNavi);
        timeG2.setTecnico(tecnicoG2);

        //Setting players
        timeFuria.setJogadorList(jogadoresFuria);
        timeLiquid.setJogadorList(jogadoresLiquid);
        timeNavi.setJogadorList(jogadoresNavi);
        timeG2.setJogadorList(jogadoresG2);

        //Setting torneios
        plataforma.setTorneioList(torneios);

        //Setting times
        torneio1.setTimeList(timesTorneio1);
        torneio2.setTimeList(timesTorneio2);

        System.out.println(plataforma);

        torneio1.qualTorneioJogadorEsta(j2);
    }
}
