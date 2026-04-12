package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class PlanoDeSaude {

    private String nome;
    private int idPaciente;

    public PlanoDeSaude(String nome) {
        this.nome = nome;
    }

    public PlanoDeSaude(String nome, int idPaciente) {
        this(nome);
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
}
