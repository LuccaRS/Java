import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Funcionario {
    private String especialidade;

    // Construtor de médico para cada novo dentista cadastrado na clinica
    public Medico(String cpf, String nome, String telefone, int idade, int id, String especialidade) {
        super(cpf, nome, telefone, idade, id, especialidade);

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void realizarFuncao() {

    }

    public static void cadastrarDentista(Scanner scanner) {
        System.out.println("Cadastro de Médico:");

        System.out.print("CPF: ");
        String cpf = scanner.next();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Telefone: ");
        String telefone = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Identificação: ");
        int id = scanner.nextInt();

        System.out.print("Identificação: ");
        String especialidade = scanner.nextLine();

        Medico medico = new Medico(nome, cpf, telefone, idade, id, especialidade);

        System.out.println("Dentista cadastrado com sucesso!\n");
    }
    public static void listarMedico(ArrayList<Medico> medicos) {
        if (medicos.isEmpty()) {
            System.out.println("Não há dentistas cadastrados.");
        } else {
            System.out.println("----- MÉDICO -----");
            for (Medico medico : medicos) {
                System.out.println("Nome: " + medico.getNome());
                System.out.println("CPF: " + medico.getCpf());
                System.out.println("Idade: " + medico.getIdade());
                System.out.println("Identificação: " + medico.getId());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("-----------------------------");
            }
        }
    }
}
