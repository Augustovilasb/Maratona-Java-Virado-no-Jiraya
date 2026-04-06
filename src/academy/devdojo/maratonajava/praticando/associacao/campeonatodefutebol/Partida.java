package academy.devdojo.maratonajava.praticando.associacao.campeonatodefutebol;

public class Partida {

    private String data;
    private Time[] times;
    private Estadio estadio;

    public Partida(String data) {
        this.data = data;
    }

    public Partida(Estadio estadio, String data, Time[] times) {
        this.estadio = estadio;
        this.data = data;
        this.times = times;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Time[] getTimes() {
        return times;
    }

    public void setTimes(Time[] times) {
        this.times = times;
    }
}
