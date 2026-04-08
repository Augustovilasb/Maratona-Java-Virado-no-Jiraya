package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class PlanoDeSaude {

    private String nome;
    private String cobertura;

    public PlanoDeSaude(String nome, String cobertura) {
        this.nome = nome;
        this.cobertura = cobertura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
