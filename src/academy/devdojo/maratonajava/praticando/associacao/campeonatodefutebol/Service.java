package academy.devdojo.maratonajava.praticando.associacao.campeonatodefutebol;

public class Service {
    public static void main(String[] args) {

        Campeonato camp = new Campeonato("Cantina Camp", 1992);

        Estadio estadio = new Estadio("Maraca", 92);

        Time timeA = new Time("Flamengo", "ITAJUBÁ");
        Time timeB = new Time("Botafogo", "RONDONIA");
        Time timeC = new Time("Fluminense", "MARIA DA FÉ");
        Time timeD = new Time("Volta Redonda", "DUBLIN");
        Time[] times = {timeA, timeB, timeC, timeD};

        Jogador jogador1 = new Jogador("Julio Cesar", "Goleiro");
        Jogador jogador2 = new Jogador("Fael do Carmo", "Zagueiro");
        Jogador jogador3 = new Jogador("Felipe Atanasio", "Zagueiro");
        Jogador jogador4 = new Jogador("Joao Antonio", "Meia");
        Jogador jogador5 = new Jogador("Leandro Indiao", "Meia");
        Jogador jogador6 = new Jogador("Tucho", "Atacante");
        Jogador jogador7 = new Jogador("Markinho", "Goleiro");
        Jogador jogador8 = new Jogador("Diego Dona Nega", "Zagueiro");
        Jogador jogador9 = new Jogador("Willian", "Zagueiro");
        Jogador jogador10 = new Jogador("Bill", "Meia");
        Jogador jogador11 = new Jogador("Cacá", "Meia");
        Jogador jogador12 = new Jogador("Evinho", "Atacante");
        Jogador jogador13 = new Jogador("Jiky", "Goleiro");
        Jogador jogador14 = new Jogador("Dudz", "Zagueiro");
        Jogador jogador15 = new Jogador("Alexis", "Zagueiro");
        Jogador jogador16 = new Jogador("Dataad", "Meia");
        Jogador jogador17 = new Jogador("dede", "Meia");
        Jogador jogador18 = new Jogador("Tdeed", "Atacante");
        Jogador jogador19 = new Jogador("Maegasre", "Goleiro");
        Jogador jogador20 = new Jogador("lsdtsvvv", "Zagueiro");
        Jogador jogador21 = new Jogador("qerpfsdfs", "Zagueiro");
        Jogador jogador22 = new Jogador("zcvwdcad", "Meia");
        Jogador jogador23 = new Jogador("asdfasda", "Meia");
        Jogador jogador24 = new Jogador("asdasd", "Atacante");
        Jogador[] jogadoresA = {jogador1, jogador2, jogador3, jogador4, jogador5, jogador6};
        Jogador[] jogadoresB = {jogador7, jogador8, jogador9, jogador10, jogador11, jogador12};
        Jogador[] jogadoresC = {jogador13, jogador14, jogador15, jogador16, jogador17, jogador18};
        Jogador[] jogadoresD = {jogador19, jogador20, jogador21, jogador22, jogador23, jogador24};

        timeA.setJogadores(jogadoresA);
        timeB.setJogadores(jogadoresB);
        timeC.setJogadores(jogadoresC);
        timeD.setJogadores(jogadoresD);

        camp.setEstadio(estadio);
        camp.setTimes(times);

        camp.imprime();

    }
}
