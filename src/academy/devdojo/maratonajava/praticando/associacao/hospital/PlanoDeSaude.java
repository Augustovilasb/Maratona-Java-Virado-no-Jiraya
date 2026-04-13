package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class PlanoDeSaude {

    private String nome;
    private int idPaciente;
    private TipoPlanoDeSaude tipoPlanoDeSaude;

    public PlanoDeSaude(String nome) {
        this.nome = nome;
    }

    public PlanoDeSaude(String nome, TipoPlanoDeSaude tipoPlanoDeSaude) {
        this(nome);
        this.tipoPlanoDeSaude = tipoPlanoDeSaude;
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

    public TipoPlanoDeSaude getTipoPlanoDeSaude() {
        return tipoPlanoDeSaude;
    }

    public void setTipoPlanoDeSaude(TipoPlanoDeSaude tipoPlanoDeSaude) {
        this.tipoPlanoDeSaude = tipoPlanoDeSaude;
    }
}
