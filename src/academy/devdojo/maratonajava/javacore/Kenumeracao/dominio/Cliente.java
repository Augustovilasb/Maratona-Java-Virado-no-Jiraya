package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagemento;

public class Cliente {

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
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagemento=" + tipoPagemento +
                '}';
    }
}