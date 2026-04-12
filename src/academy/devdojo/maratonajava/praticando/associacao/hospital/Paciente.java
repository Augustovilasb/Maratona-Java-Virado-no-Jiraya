package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Paciente {

    private String nome;
    private String cpf;
    private PlanoDeSaude planoDeSaude;
    private Consulta[] consultas;
    private Hospital hospital;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public Paciente(String nome, String cpf, Consulta[] consultas, PlanoDeSaude planoDeSaude) {
        this.nome = nome;
        this.cpf = cpf;
        this.consultas = consultas;
        this.planoDeSaude = planoDeSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
}
