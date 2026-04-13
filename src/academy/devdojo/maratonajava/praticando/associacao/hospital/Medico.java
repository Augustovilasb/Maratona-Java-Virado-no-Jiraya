package academy.devdojo.maratonajava.praticando.associacao.hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico {

    private String nome;
    private String especialidade;
    private List<Consulta> consultas = new ArrayList<>();

    public Medico(String nome) {
        this.nome = nome;
    }

    public Medico(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Medico(String nome, String especialidade, List<Consulta> consultas) {
        this(nome, especialidade);
        this.consultas = consultas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
