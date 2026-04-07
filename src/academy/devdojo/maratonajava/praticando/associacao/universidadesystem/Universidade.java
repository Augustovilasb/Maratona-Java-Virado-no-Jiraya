package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

public class Universidade {

    private String nome;
    private String cidade;
    private Curso[] cursos;

    public Universidade(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Universidade(String nome, String cidade, Curso[] cursos) {
        this.nome = nome;
        this.cidade = cidade;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
