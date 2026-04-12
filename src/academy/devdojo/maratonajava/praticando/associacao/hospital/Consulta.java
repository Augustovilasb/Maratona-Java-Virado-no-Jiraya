package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Consulta {

    private String date;
    private String diagnostico;
    private double price;
    private Medico[] medicos;
    private Paciente[] pacientes;

    public Consulta(String date) {
        this.date = date;
    }

    public Consulta(String date, String diagnostico) {
        this(date);
        this.diagnostico = diagnostico;
    }

    public Consulta(String date, String diagnostico, double price, Medico[] medicos, Paciente[] pacientes) {
        this(date, diagnostico);
        this.price = price;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPaciente(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
}