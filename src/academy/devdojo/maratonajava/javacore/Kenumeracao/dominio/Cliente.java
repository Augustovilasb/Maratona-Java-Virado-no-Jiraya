package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Cliente {

    // private, public or protected
    public enum TipoPagemento {
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagemento tipoPagemento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagemento tipoPagemento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagemento = tipoPagemento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagemento=" + tipoPagemento +
                '}';
    }
}