package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Consulta {

    private String date;
    private String diagnostico;
    private double price;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String date) {
        this.date = date;
    }

    public Consulta(String date, String diagnostico) {
        this(date);
        this.diagnostico = diagnostico;
    }

    public Consulta(String date, String diagnostico, double price, Medico medico, Paciente paciente) {
        this(date, diagnostico);
        this.price = price;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "date='" + date + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", price=" + price +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}