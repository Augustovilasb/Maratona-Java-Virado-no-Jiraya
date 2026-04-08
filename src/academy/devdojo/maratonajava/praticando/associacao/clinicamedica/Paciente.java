package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class Paciente {

    private String nome;
    private double cpf;
    private PlanoDeSaude planoDeSaude;

    public Paciente(String nome, double cpf, String total) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Paciente(String nome, double cpf, PlanoDeSaude planoDeSaude) {
        this.nome = nome;
        this.cpf = cpf;
        this.planoDeSaude = planoDeSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
}
