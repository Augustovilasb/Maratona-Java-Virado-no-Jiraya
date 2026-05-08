package academy.devdojo.maratonajava.javacore.Minterfaces.domian;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões;");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Metodo dentro da Interface DataLoader");
    }

}
