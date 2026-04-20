package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

public class Organizador {

    private String name;
    private String organizadorPaisOrigem;

    public Organizador(String name, String organizadorPaisOrigem) {
        this.name = name;
        this.organizadorPaisOrigem = organizadorPaisOrigem;
    }

    @Override
    public String toString() {
        return "Organizador name: " + this.getName() + ", Pais de origem: " + this.getOrganizadorPaisOrigem();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizadorPaisOrigem() {
        return organizadorPaisOrigem;
    }

    public void setOrganizadorPaisOrigem(String organizadorPaisOrigem) {
        this.organizadorPaisOrigem = organizadorPaisOrigem;
    }
}
