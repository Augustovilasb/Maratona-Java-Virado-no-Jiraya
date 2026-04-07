package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

public class Sala {

    private int numero;
    private int andar;

    public Sala(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
