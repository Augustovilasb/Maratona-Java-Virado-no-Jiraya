package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {


        // if salario > 5000, doar;
        double salario = 6000;
        // String  mensagemDoar = "Eu vou doar 500 pro DevDojo";
        // String  mensagemNaoDoar = "Eu ainda não tenho condições, mas vou ter";
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        // CONDIÇÃO ? VERDADEIRO : FALSO;

        String resultado = salario < 5000 ? "Eu ainda não tenho condições, mas vou ter" : "Eu vou doar 500 pro DevDojo";

        System.out.printf(resultado);


/*        if (salario < 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }

        System.out.println(resultado);
*/



    }
}
