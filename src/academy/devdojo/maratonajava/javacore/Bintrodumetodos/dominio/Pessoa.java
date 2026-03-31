package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

public class Pessoa {

    public String name;
    private int idade;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.idade);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getIdade() {
        return this.idade;
    }


}
