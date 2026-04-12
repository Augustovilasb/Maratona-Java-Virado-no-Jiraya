package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco estático de inicialização de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 2");
    }

    public Funcionario (String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagemento() {
        System.out.println("Funcionário: " + getNome() + ", recebe o salário de: " + getSalario());
        System.out.println("Adicionando o valor de: " + getSalario() + " no CPF " + getCpf());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
