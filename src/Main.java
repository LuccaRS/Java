import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Dentista> dentistas = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Secretaria> secretarias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean manter  = true;

        while (manter) {
            System.out.println("----- MENU CLINICA BEM SORRIR COM SAÚDE -----");
            System.out.println("1 -> Cadastrar Paciente");
            System.out.println("2 -> Cadastrar Dentista");
            System.out.println("3 -> Cadastrar Médico");
            System.out.println("4 -> Cadastrar Secretária");
            System.out.println("5 -> Marcar Consulta");
            System.out.println("6 -> Listar Pacientes");
            System.out.println("7 -> Listar Dentistas");
            System.out.println("8 -> Listar Médicos");
            System.out.println("9 -> Sair do menu da clínica");

            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    cadastrarPaciente(pacientes, scanner);
                    break;
                case 2:
                    cadastrarDentista(dentistas, scanner);
                    break;
                case 3:
                    cadastrarMedico(medicos, scanner);
                    break;
                case 4:
                    cadastrarSecretaria(secretarias, scanner);
                    break;
                case 5:
                    marcarConsulta(pacientes, dentistas, medicos, secretarias, scanner);
                    break;
                case 6:
                    listarPacientes(pacientes);
                    break;
                case 7:
                    listarDentistas(dentistas);
                    break;
                case 8:
                    listarMedicos(medicos);
                    break;
                case 9:
                    // saída do progra
                    System.out.println("Saindo do programa...");
                    manter = false;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarPaciente(ArrayList<Paciente> pacientes, Scanner scanner) {
        // Implemente a lógica para cadastrar um paciente
    }

    private static void cadastrarDentista(ArrayList<Dentista> dentistas, Scanner scanner) {
        // Implemente a lógica para cadastrar um dentista
    }

    private static void cadastrarMedico(ArrayList<Medico> medicos, Scanner scanner) {
        // Implemente a lógica para cadastrar um médico
    }

    private static void cadastrarSecretaria(ArrayList<Secretaria> secretarias, Scanner scanner) {
        // Implemente a lógica para cadastrar uma secretária
    }

    private static void marcarConsulta(
            ArrayList<Paciente> pacientes, ArrayList<Dentista> dentistas,
            ArrayList<Medico> medicos, ArrayList<Secretaria> secretarias, Scanner scanner) {
        // Implemente a lógica para marcar uma consulta
    }

    private static void listarPacientes(ArrayList<Paciente> pacientes) {
        // Implemente a lógica para listar os pacientes
    }

    private static void listarDentistas(ArrayList<Dentista> dentistas) {
        // Implemente a lógica para listar os dentistas
    }

    private static void listarMedicos(ArrayList<Medico> medicos) {
        // Implemente a lógica para listar os médicos
    }
}
