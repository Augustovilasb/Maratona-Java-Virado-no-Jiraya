package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagemento;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;

public class ClientTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagemento.CREDITO);
        Cliente cliente2 = new Cliente("kAMIMI", TipoCliente.PESSOA_JURIDICA, TipoPagemento.CREDITO);
        Cliente cliente3 = new Cliente("Knouva", TipoCliente.PESSOA_FISICA, TipoPagemento.DEBITO);
        Cliente cliente4 = new Cliente("Jivmarrad", TipoCliente.PESSOA_FISICA, TipoPagemento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(TipoPagemento.DEBITO.CalculoDesconto(100));
        System.out.println(TipoPagemento.CREDITO.CalculoDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente.getNomeRelatorio());
        System.out.println(tipoCliente2);
    }
}
