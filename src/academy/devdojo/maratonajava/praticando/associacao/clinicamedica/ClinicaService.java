package academy.devdojo.maratonajava.praticando.associacao.clinicamedica;

public class ClinicaService {
    public static void main(String[] args) {

        Clinica clinica = new Clinica("Clinica TCH", "58 Rathmines Road Upper");

        Sala salaEndocrino = new Sala(10, 1);
        Sala salaCardiologista = new Sala(11, 2);
        Sala salaOftamologista = new Sala(12, 3);
        Sala salaNefrologista = new Sala(13, 4);

        PlanoDeSaude planoTotal = new PlanoDeSaude("Total", "Completa");
        PlanoDeSaude planoParcial = new PlanoDeSaude("Parcial", "Nao completa");
        PlanoDeSaude planoZero = new PlanoDeSaude("None", "Sem plano");

        Paciente pacienteEndocrino = new Paciente("João", 117.536, planoTotal);
        Paciente pacienteCardiologista = new Paciente("Dede", 182.468, planoParcial);
        Paciente pacienteOftamologista = new Paciente("Barbara", 164.136, planoZero);
        Paciente pacienteNefrologista = new Paciente("Gabriela", 687.116, planoParcial);

        Medico medico1 = new Medico("José", "Endocrinologista");
        Medico medico2 = new Medico("Lucas", "Cardiologista");
        Medico medico3 = new Medico("Dan", "Oftamologista");
        Medico medico4 = new Medico("Davi", "Nefrologista");

        Consulta consultaEndocrino = new Consulta("11/04", 14, pacienteEndocrino, salaEndocrino);
        Consulta consultaCardiologista = new Consulta("05/01", 11, pacienteCardiologista, salaCardiologista);
        Consulta consultaOftamologista = new Consulta("20/05", 13, pacienteOftamologista, salaOftamologista);
        Consulta consultaNefrologista = new Consulta("27/08", 17, pacienteNefrologista, salaNefrologista);

        salaEndocrino.setClinica(clinica);
        salaCardiologista.setClinica(clinica);
        salaOftamologista.setClinica(clinica);
        salaNefrologista.setClinica(clinica);

        consultaEndocrino.setMedicos(medico1);
        consultaCardiologista.setMedicos(medico2);
        consultaOftamologista.setMedicos(medico3);
        consultaNefrologista.setMedicos(medico4);

        medico1.setConsultas(new Consulta[]{consultaEndocrino});
        medico2.setConsultas(new Consulta[]{consultaCardiologista});
        medico3.setConsultas(new Consulta[]{consultaOftamologista});
        medico4.setConsultas(new Consulta[]{consultaNefrologista});

        consultaEndocrino.imprime();
        consultaCardiologista.imprime();
        consultaOftamologista.imprime();
        consultaNefrologista.imprime();
    }
}