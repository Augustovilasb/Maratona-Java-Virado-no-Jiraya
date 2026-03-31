package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

public class Professor {

    public String name;
    public int idade;
    public String materia;
    public String faculdade;

    public void imprimeDados() {
        System.out.println("##############################");
        System.out.println("Nome: " + this.name + ", \n" +
                "Idade: " + this.idade + ", \n" +
                "Matéria: " + this.materia + "anos, \n" +
                "Faculdade: " + this.faculdade);
    }
}
