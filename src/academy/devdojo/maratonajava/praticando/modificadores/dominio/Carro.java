package academy.devdojo.maratonajava.praticando.modificadores.dominio;

public class Carro {

    private String modelo;
    private int[] qntMarcha;
    public static double velocidadeMax;

    public Carro(String modelo, int qntMarcha) {
        this.modelo = modelo;
        this.qntMarcha = new int[qntMarcha];
        for (int i = 0; i < this.qntMarcha.length; i++) {
            this.qntMarcha[i] = i + 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append("Modelo: ").append(modelo).append("\n");
        for (int marcha : qntMarcha) {
            stb.append("Marcha: ").append(marcha).append("\n");
        }
        stb.append("Velocidade Máxima: ").append(velocidadeMax);
        return stb.toString();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setQntMarcha(int qntMarcha) {
        this.qntMarcha = new int[qntMarcha];
        for (int i = 0; i < this.qntMarcha.length; i++) {
            this.qntMarcha[i] = i + 1;
        }
    }
}