package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

public class Tecnico {

    private String name;
    private String nacionalidade;

    public Tecnico(String name, String nacionalidade) {
        this.name = name;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return  "Nacionalidade: " + this.getNacionalidade() + ", Name: " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
