package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        // while, do while, fori, foreach

        //while é OBRIGATÓRIAMENTE de valor BOOLEANO
        int count = 0;

        while (count < 10) {
            System.out.println(++count);
            count++;
        }

        count = 0;
        do {
            count+=15;
            System.out.println("dentro do do-w vtnc");
        } while (count < 100);

        for (int i = 0; i < 10; i++) {
            System.out.println("bitica");;
        }

    }
}
