package academy.devdojo.maratonajava.praticando.enumeracao;

public enum Semana {

    SEGUNDA(1, "Segunda"),
    TERCA(2, "Terça"),
    QUARTA(3, "Quarta"),
    QUINTA(4, "Quinta"),
    SEXTA(5, "Sexta"),
    SABADO(6, "Sábado"),
    DOMINGO(7, "Domingo");

    private int valor;
    private String nome;

    Semana(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static Semana BuscaDiasDaSemana(int valor) {
        for (Semana semana : values()) {
            if (semana.getValor() == valor) {
                return semana;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
