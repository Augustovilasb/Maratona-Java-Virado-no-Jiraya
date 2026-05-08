package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Banco de dados removidos...");
    }

    @Override
    public void checkPermission() {
//        DataLoader.super.checkPermission();
        System.out.println("Fazendo checagem de permissoes para carregar um banco de dados.");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Metodo dentro da Classe DatabaseLoader");
        System.out.println(DataLoader.MAX_DATA_SIZE);
    }
}
