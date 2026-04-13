package academy.devdojo.maratonajava.praticando.associacao.hospital;

public class Service {

    public static void adicionarMedico(Hospital hospital, Medico medico) {
        hospital.getMedicos().add(medico);
    }

    public static void adicionarPaciente(Hospital hospital, Paciente paciente) {
        hospital.getPacientes().add(paciente);
    }

    public static void agendarConsulta(Medico medico, Paciente paciente, Consulta consulta) {
        medico.getConsultas().add(consulta);
        paciente.getConsultas().add(consulta);
    }

    public static void relatorioHospitalar(Hospital hospital) {
        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("HOSPITAL " + hospital.getNome());
        System.out.println("CNPJ DO HOSPITAL: " + hospital.getCnpj());
        System.out.println("-----------------------------------------");
        System.out.println("Quantidade de Médicos disponíveis: ");
        System.out.println("Atualmente: " + hospital.getMedicos().size() + " médicos disponíveis.");
        System.out.println("-----------------------------------------");
        System.out.println("Temos os melhores médicos da região: ");
        for (Medico medico : hospital.getMedicos()) {
            System.out.println("Dr. " + medico.getNome() + ", especialidade: " + medico.getEspecialidade());
        }
        System.out.println("#########################################");
    }

    public static void relatorioPacientesEspera(Hospital hospital) {
        System.out.println("#########################################");
        System.out.println("RELATÓRIO DE PACIENTES " + hospital.getNome());
        System.out.println("Quantidade de pacientes: " + hospital.getPacientes().size());

        System.out.println("#########################################");
        System.out.println("DADOS DO PACIENTE: ");
        for (Paciente paciente : hospital.getPacientes()) {
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("CPF: " + paciente.getCpf());
            if (paciente.getPlanoDeSaude() != null) {
                System.out.println("Plano de Saúde: " + paciente.getPlanoDeSaude().getNome());
            }

            System.out.println("------------------------------------");
            System.out.println("RELATÓRIO DE CONSULTA");
            System.out.println("Quantidade de Consultas: " + paciente.getConsultas().size());

            for (Consulta consulta : paciente.getConsultas()) {
                if (paciente.getPlanoDeSaude() != null) {
                    double desconto = paciente.getPlanoDeSaude().getTipoPlanoDeSaude().CalculoDesconto(consulta.getPrice());
                    System.out.println("Médico: " + consulta.getMedico().getNome() + ", especialidade: " + consulta.getMedico().getEspecialidade());
                    System.out.println("Data: " + consulta.getDate());
                    System.out.println("Price: " + consulta.getPrice());
                    System.out.println("Price com desconto " + (consulta.getPrice() - desconto));
                    System.out.println("DIAGNÓSTICO DO PACIENTE");
                    if (consulta.getDiagnostico() != null) {
                        System.out.println("Diagnóstico: " + consulta.getDiagnostico());
                    }
                }
                System.out.println("#########################################");
                System.out.println("#########################################");
            }
        }
    }
}