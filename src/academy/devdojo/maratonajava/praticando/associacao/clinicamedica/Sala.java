package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class Sala {

    private int numero;
    private int andar;
    private Clinica clinica;

    public Sala(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public Sala(int numero, int andar, Clinica clinica) {
        this.numero = numero;
        this.andar = andar;
        this.clinica = clinica;
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

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
