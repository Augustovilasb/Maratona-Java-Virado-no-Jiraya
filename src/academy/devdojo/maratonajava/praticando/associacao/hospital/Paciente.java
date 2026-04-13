package academy.devdojo.maratonajava.praticando.associacao.hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private String nome;
    private String cpf;
    private PlanoDeSaude planoDeSaude;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public Paciente(String nome, String cpf, List<Consulta> consultas, PlanoDeSaude planoDeSaude) {
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

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
}
