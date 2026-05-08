package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Banco de dados removidos...");
    }
}
