package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class Consulta {

    private String data;
    private int horario;
    private Paciente paciente;
    private Sala sala;
    private Medico medicos;

    public Consulta() {
    }

    public Consulta(String data, int horario) {
        this.data = data;
        this.horario = horario;
    }

    public Consulta(String data, int horario, Paciente paciente, Sala sala) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.sala = sala;
    }

    public void imprime() {
        System.out.println(" ");
        System.out.println("################# WELCOME #################");
        System.out.println("CLINIC: " + sala.getClinica().getNome());
        System.out.println("ENDERECO: " + sala.getClinica().getEndereco());
        System.out.println("###########################################");
        System.out.println("DOCTOR: " + medicos.getNome());
        System.out.println("SPECIALIST: " + medicos.getEspecialidade());
        System.out.println("###########################################");
        System.out.println("PACIENT: " + paciente.getNome() + ", CPF: " + paciente.getCpf());
        System.out.println("ENSURANCE: " + paciente.getPlanoDeSaude().getNome());
        System.out.println("COBERTURA: " + paciente.getPlanoDeSaude().getCobertura());
        System.out.println("###########################################");
        System.out.println("WHEN: " + this.data + ", TIME: " + this.horario);
        System.out.println("ROOM: " + sala.getNumero() + ", FLOR: " + sala.getAndar());
        System.out.println("###########################################");
        System.out.println("");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Medico getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medicos) {
        this.medicos = medicos;
    }
}
