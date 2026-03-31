package academy.devdojo.maratonajava.praticando.modificadores.dominio;

public class Produto {

    // ATRIBUTOS
    private String nome;
    private String codigo;
    private static double precoMin;

    // CONSTRUTOR
    public Produto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // toString PARA IMPRIMIR O RESULTADO
    @Override
    public String toString() {
        return "| Nome do Produto: " + nome + " " +
               "| Código do Produto: " + codigo + " " +
               "| Preço Mínimo: " + Produto.precoMin;
    }

    // GETTERS & SETTERS
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public static double getPrecoMin() {return precoMin;}
    public static void setPrecoMin(double precoMin) {Produto.precoMin = precoMin;}
}
