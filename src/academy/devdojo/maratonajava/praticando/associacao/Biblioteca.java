package academy.devdojo.maratonajava.praticando.associacao;

public class Biblioteca {

    private String nome;
    private String endereco;
    private Livro[] livros;

/*    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }*/

    public Biblioteca(String nome, String endereco, Livro[] livros) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = livros;
    }

    public void imprime() {
        System.out.println(" ");
        System.out.println("-------------- BIBLIOTECA ----------------");
        System.out.println("Biblioteca: " + this.getNome());
        System.out.println("Localizada: " + this.getEndereco());
            if (livros == null) return;
        for (Livro livro : livros) {
        System.out.println("---------------- LIVROS ------------------");
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Editora: " + livro.getEditora().getNome());
            if (livro.getAutores() == null) return;
            for (Autor autor : livro.getAutores()) {
                System.out.println("Autores: " + autor.getNome());
            }
        }
        System.out.println("------------------------------------------");
    }

    public String getEndereco() {return endereco;}
//    public void setEndereco(String endereco) {this.endereco = endereco;}
//    public Livro[] getLivros() {return livros;}
//    public void setLivros(Livro[] livros) {this.livros = livros;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

}
