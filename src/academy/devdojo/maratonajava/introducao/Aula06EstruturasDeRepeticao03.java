package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        // Numa lista de 50 números, imprima os primeiros 25

        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
                System.out.println(i);
        }

            // OBS O COMANDO BREAK, VAI PARAR O LACO DE REPETICAO
            // MAS SEMPRE DENTRO DE UM LOOP OU SWITCH

    }
}
