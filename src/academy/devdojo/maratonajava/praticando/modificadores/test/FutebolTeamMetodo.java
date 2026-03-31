package academy.devdojo.maratonajava.praticando.modificadores.test;

import academy.devdojo.maratonajava.praticando.modificadores.dominio.FutebolTeam;

public class FutebolTeamMetodo {

    public void montandoTeam() {

        FutebolTeam.setMaxJogadores(15);

        FutebolTeam team1 = new FutebolTeam("Flamengo", new String[]{"Zico", "Dunga", "Airton", "Adriano", "Souza",
                                                                          "Vagner Love", "Garrincha", "Neymar", "Ronaldinho Gaucho",
                                                                            "Pelé", "Maradona","Gabriela","Geraldo","jojo","kiki"});
        FutebolTeam team2 = new FutebolTeam("Palmeiras");

        team2.setJogadores(new  String[]{"Lucas", "Abreu", "Antonio", "Augusto", "Vilas Boas", "Sirley","Romeu", "Elcio", "Nane","Felipe", "Ratinho","Flavinho"});
        team1.setTitulos(43);
        team2.setTitulos(35);

        System.out.println(team1);
        System.out.println("A quantidade de jogadores do Flamengo é: " + team1.getJogadores().length);
        System.out.println(team2);
        System.out.println("A quantidade de jogadores do Palmeiras é: " + team2.getJogadores().length);

    }
}
