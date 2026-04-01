package academy.devdojo.maratonajava.praticando.associacao;

public class BibliotecaService {

    public static void main(String[] args) {

            Livro livro1 = new Livro("Capitães de Areia", 1996);
            Livro livro2 = new Livro("Don Casmurro", 1984);
            Livro[] livros = {livro1,livro2};
            Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
            Autor autor2 = new Autor("Renato 38tão", "Brasileiro");
            Autor autor3 = new Autor("Fernando Rocha", "Jamaicano");
            Autor autor4 = new Autor("Jack Jhonson", "Australiano");
            Editora editora1 = new Editora("Libra", "England");
            Editora editora2 = new Editora("Saraiva", "Brazil");
            livro1.setEditora(editora1);
            livro2.setEditora(editora2);
            livro1.setAutores(new Autor[]{autor4, autor2});
            livro2.setAutores(new Autor[]{autor1, autor3});
            Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional Ireland", "Trinity College, Dublin 1", livros);
            biblioteca.imprime();
    }
}
