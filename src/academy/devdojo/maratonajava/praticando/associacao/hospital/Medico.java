package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Medico {

    private String nome;
    private String especialidade;
    private Consulta[] consultas;
    private Hospital hospital;

    public Medico(String nome) {
        this.nome = nome;
    }

    public Medico(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Medico(String nome, String especialidade, Consulta[] consultas) {
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

    public Consulta[] getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }
}
