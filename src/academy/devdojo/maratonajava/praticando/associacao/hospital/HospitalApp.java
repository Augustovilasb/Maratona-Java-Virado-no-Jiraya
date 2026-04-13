package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("ESCOLA ITAJUBÁ", "1000/23658.23645");

        Medico medicoUrologista = new Medico("José Joaquim", "Urologista");
        Medico medicoOftalmo = new Medico("José Almeida", "Oftalmologista");
        Medico medicoNefrologista = new Medico("José Silva", "Nefrologista");
        Medico medicoDermatologista = new Medico("José Correa", "Dermatologista");

        PlanoDeSaude planoDiamante = new PlanoDeSaude("Plano Diamante",TipoPlanoDeSaude.PLANO_DIAMANTE);
        PlanoDeSaude planoGold = new PlanoDeSaude("Plano Gold",TipoPlanoDeSaude.PLANO_GOLD);
        PlanoDeSaude planoSilver = new PlanoDeSaude("Plano Silver",TipoPlanoDeSaude.PLANO_SILVER);

        Paciente paciente1 = new Paciente("Gabriela Fonseca", "321.654.987-75");
        Paciente paciente2 = new Paciente("Jose Almeida", "987.654.321=65");
        Paciente paciente3 = new Paciente("Sirley Vilas Boas", "654.963.852-13");
        Paciente paciente4 = new Paciente("Catarina Vilas Boas", "174.285.396-66");

        Consulta consultaUrologista = new Consulta("06/07/2005", "Infecção de Urina", 70, medicoUrologista, paciente1);
        Consulta consultaOftalmo = new Consulta("31/04/2005", "Astigmatism", 70, medicoOftalmo, paciente2);
        Consulta consultaNefrologista = new Consulta("19/03/2005", "Aguardando exame", 70, medicoNefrologista, paciente3);
        Consulta consultaDermatologista = new Consulta("22/11/2005", "Frieira", 70, medicoDermatologista, paciente4);

        paciente1.setPlanoDeSaude(planoGold);
        paciente2.setPlanoDeSaude(planoSilver);
        paciente3.setPlanoDeSaude(planoDiamante);
        paciente4.setPlanoDeSaude(planoGold);

        Service.adicionarMedico(hospital, medicoUrologista);
        Service.adicionarMedico(hospital, medicoOftalmo);
        Service.adicionarMedico(hospital, medicoNefrologista);
        Service.adicionarMedico(hospital, medicoDermatologista);

        Service.adicionarPaciente(hospital, paciente1);
        Service.adicionarPaciente(hospital, paciente2);
        Service.adicionarPaciente(hospital, paciente3);
        Service.adicionarPaciente(hospital, paciente4);

        Service.agendarConsulta(medicoUrologista, paciente1, consultaUrologista);
        Service.agendarConsulta(medicoOftalmo, paciente2, consultaOftalmo);
        Service.agendarConsulta(medicoNefrologista, paciente3, consultaNefrologista);
        Service.agendarConsulta(medicoDermatologista, paciente4, consultaDermatologista);

        Service.relatorioHospitalar(hospital);

        Service.relatorioPacientesEspera(hospital);
    }
}
