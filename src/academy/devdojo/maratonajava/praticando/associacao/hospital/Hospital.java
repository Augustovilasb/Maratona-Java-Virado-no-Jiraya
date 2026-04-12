package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Hospital {

    private String nome;
    private String cnpj;
    private Medico[] medicos;
    private Paciente[] pacientes;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public Hospital(String nome, String cnpj) {
        this(nome);
        this.cnpj = cnpj;
    }

    public Hospital(String nome, String cnpj, Medico[] medicos, Paciente[] pacientes) {
        this(nome, cnpj);
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
}
