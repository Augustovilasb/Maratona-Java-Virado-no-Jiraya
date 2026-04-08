package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class Clinica {

    private String nome;
    private String endereco;
    private Medico[] medicos;
    private Sala[] salas;

    public Clinica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Clinica(String nome, String endereco, Medico[] medicos) {
        this.nome = nome;
        this.endereco = endereco;
        this.medicos = medicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
