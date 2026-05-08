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
}
