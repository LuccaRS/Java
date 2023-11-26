import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criacao dos objetos presentes no consultorio

        ArrayList<Dentista> dentistas = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Secretaria> secretarias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // variavel para controle de dados
        boolean manter  = true;
        int i = 0;

        // criando um Menu para o funcionamento de tudo possível da clinica
        // Inclui cadastros, listamentos e marcar consulta
        while (manter) {
            System.out.println("----- CLINICA BEM SORRIR COM SAÚDE -----");
            System.out.println("1 -> Cadastrar Paciente");
            System.out.println("2 -> Cadastrar Dentista");
            System.out.println("3 -> Cadastrar Médico");
            System.out.println("4 -> Cadastrar Secretária");
            System.out.println("5 -> Marcar Consulta");
            System.out.println("6 -> Listar Pacientes");
            System.out.println("7 -> Listar Dentistas");
            System.out.println("8 -> Listar Médicos");
            System.out.println("9 -> Sair do menu da clínica");

            // var. para entrada de dados
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    Paciente.cadastrarPaciente(pacientes,scanner);
                    break;

                case 2:
                   Dentista.cadastrarDentista(dentistas,scanner);
                    break;

                case 3:
                    Medico.cadastrarMedico(medicos,scanner);
                    break;

                case 4:
                    Secretaria.cadastrarSecretaria(secretarias,scanner);
                    break;

                case 5:

                    break;
                case 6:
                    Paciente.listarPacientes(pacientes);
                    break;

                case 7:
                    Dentista.listarDentista(dentistas);
                    break;

                case 8:
                    Medico.listarMedico(medicos);
                    break;

                case 9:
                    // saída do programa
                    System.out.println("Saindo do programa...");
                    manter = false;
                default:
                    System.out.println("Opção inválida! ");
            }
        }
    }


}
