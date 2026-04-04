package academy.devdojo.maratonajava.praticando.associacao.academialuta;

public class Turma {

    private String nome;
    private int horario;
    private Aluno[] alunos;
    private Professor professor;
    private Sala sala;

    public Turma(String nome, int horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public Turma(String nome, int horario, Professor professor, Aluno[] alunos, Sala sala) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
        this.sala = sala;
    }

    public void imprime() {
        System.out.println("########################################################");
        System.out.println("#############      TURMA: " + this.nome + "      ##############");
        System.out.println("#############  PROFESSOR: " + this.professor.getNome() + "  ##############");
        System.out.println("#############   HORÁRIO: " + this.horario + " horas   ##############");
        System.out.println("#############      SALA: " + this.sala.getNumero() + "         ##############");
        System.out.println("########################################################");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
