package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domian.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domian.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DatabaseLoader databaseL = new DatabaseLoader();
        FileLoader fileL = new FileLoader();

        databaseL.load();
        fileL.load();

        databaseL.remove();
        fileL.remove();
    }
}
