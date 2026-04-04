package academy.devdojo.maratonajava.praticando.associacao.academialuta;

public class Professor {

    private String nome;
    private String graduacao;
    private Turma[] turmas;

    public Professor(String nome, String graduacao) {
        this.nome = nome;
        this.graduacao = graduacao;
    }

    public Professor(String nome, String graduacao, Turma[] turmas) {
        this.nome = nome;
        this.graduacao = graduacao;
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }
}