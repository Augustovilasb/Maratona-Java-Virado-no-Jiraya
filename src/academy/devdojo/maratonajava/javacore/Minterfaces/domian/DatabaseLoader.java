package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }
}
