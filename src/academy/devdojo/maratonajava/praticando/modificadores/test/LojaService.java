package academy.devdojo.maratonajava.praticando.modificadores.test;

import academy.devdojo.maratonajava.praticando.modificadores.dominio.Produto;

public class LojaService {
    public void criaProduto() {

        Produto produto1 = new Produto("Hardware Wallet", "BTC.0509");
        Produto produto2 = new Produto("Placa Metálica", "PF.0510");
        Produto produto3 = new Produto("Consultoria BTC", "CST.0511");
        Produto.setPrecoMin(200);
        produto1.setNome("Cold Wallet");
        produto2.setNome("Placa Aço Metálica");
        produto3.setNome("Consultoria BTCH");
        produto3.setCodigo("CSTCH.0511");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);

    }
}
