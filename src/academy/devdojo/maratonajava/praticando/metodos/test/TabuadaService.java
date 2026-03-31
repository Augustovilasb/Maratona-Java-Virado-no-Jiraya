        package academy.devdojo.maratonajava.praticando.metodos.test;

        import academy.devdojo.maratonajava.praticando.metodos.dominio.TabuadaMetodo;
        import java.util.Scanner;

        public class TabuadaService {
            public static void main(String[] args) {

                TabuadaMetodo metodo = new TabuadaMetodo();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, input the number: ");
                metodo.printTabuada(scanner);
            }
        }
