package academy.devdojo.maratonajava.praticando.associacao;

public class Autor {

    private String nome;
    private String nacionalidade;
//    private Livro[] livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

/*    public Autor(String nome, String nacionalidade, Livro[] livros) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = livros;
    }*/

/*    public Livro[] getLivros() {return livros;}
    public void setLivros(Livro[] livros) {this.livros = livros;}
    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}*/
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

}
