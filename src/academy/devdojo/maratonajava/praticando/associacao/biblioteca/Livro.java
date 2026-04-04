package academy.devdojo.maratonajava.praticando.associacao.biblioteca;

public class Livro {

    private String titulo;
    private int ano;
    private Autor[] autores;
    private Editora editora;

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

/*    public Livro(String titulo, int ano, Autor[] autores, Editora editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.editora = editora;
    }*/


//    public int getAno() {return ano;}
//    public void setAno(int ano) {this.ano = ano;}
    public Autor[] getAutores() {return autores;}
    public void setAutores(Autor[] autores) {this.autores = autores;}
    public Editora getEditora() {return editora;}
    public void setEditora(Editora editora) {this.editora = editora;}
    public String getTitulo() {return titulo;}
//    public void setTitulo(String titulo) {this.titulo = titulo;}

}
