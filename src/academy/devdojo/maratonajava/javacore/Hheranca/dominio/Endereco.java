package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco extends Funcionario {

    private String rua;
    private String cep;
    private Funcionario funcionario;

    public void imprime() {
        Pessoa p = new Pessoa();
        p.setNome("Jonas");
        p.setCpf("321.654.987-85");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(10000);
        Endereco endeP = new Endereco();
        endeP.setRua("Anopalis Roça");
        endeP.setCep("35.966-00");
        p.setEndereco(endeP);

        System.out.println("Funcionario: " + p.getNome() + ", que tem o CPF: " + p.getCpf() + ", e mora na Rua: " + p.getEndereco().getRua() + "\n" +
                "portador do CEP: " + p.getEndereco().getCep() + ", recebe salário de: " + funcionario2.getSalario());
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
