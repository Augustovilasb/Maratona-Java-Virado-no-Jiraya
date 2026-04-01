package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println(" ");
        System.out.println("#####################################################");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("############## SEMINÁRIOS DISPONÍVEIS ###############");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
        System.out.println("#################### ENDEREÇO #######################");
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("################ ALUNOS CADASTRADOS #################");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
            }
        System.out.println("#####################################################");
        System.out.println(" ");
        }
    }

        public String getEspecialidade () {
            return especialidade;
        }
        public void setEspecialidade (String especialidade){
            this.especialidade = especialidade;
        }
        public String getNome () {
            return nome;
        }
        public void setNome (String nome){
            this.nome = nome;
        }
        public Seminario[] getSeminarios () {
            return seminarios;
        }
        public void setSeminarios (Seminario[]seminarios){
            this.seminarios = seminarios;
        }
}
