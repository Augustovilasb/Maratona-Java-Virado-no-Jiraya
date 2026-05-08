package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public class FileLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando arquivo do banco de dados...");
    }

}
