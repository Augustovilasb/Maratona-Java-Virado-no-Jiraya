package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Dev;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Nane", 5000);
        Dev dev1 = new Dev("Tch", 10000);
        System.out.println(gerente1);
        System.out.println(dev1);

        gerente1.print();
        dev1.print();

    }
}
