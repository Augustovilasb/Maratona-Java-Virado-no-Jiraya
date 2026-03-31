package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos, são os que guardam valores em memorias");
        System.out.println("E necessariamente são todos escritos em letras minusculas");
        System.out.println("int, char, float, double, byte, short, long, boolean");
        System.out.println("Por exemplo:");
        int idadeDaVo = 80;
        int idadeDaMae = 50;
        System.out.println("Com quantos anos vó teve mae?");
        int quandoNasceu = (idadeDaVo-idadeDaMae);
        System.out.println("Então vó teve mae com " + quandoNasceu + " aninhos");
    }
}
