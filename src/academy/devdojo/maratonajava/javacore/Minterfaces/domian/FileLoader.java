package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando arquivo do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Arquivos removidos...");
    }

    @Override
    public void checkPermission() {
//        DataLoader.super.checkPermission();
        System.out.println("Fazendo checagem de permissoes para carregamento de um arquivo do banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Metodo dentro da Classe FileLoader");
    }
}
