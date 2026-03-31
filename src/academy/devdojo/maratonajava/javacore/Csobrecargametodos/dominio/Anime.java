package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String genero;
    private String name;
    private String tipo;
    private int epsodios;

    public void init(String name, String tipo, int epsodios) {
        this.name = name;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }
    public void init(String genero, String name, String tipo, int epsodios) {
        this.init(name,tipo,epsodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.genero);
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
    public void setName(String name) {
        this.name = name;
    }
        public String getTipo() {
        return this.tipo;
    }
    public int getEpsodios() {
        return this.epsodios;
    }
    public String getName() {
        return this.name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
