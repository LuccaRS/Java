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


    @Override
    public void realizarFuncao() {
        System.out.println("o médico está em consulta agora!");

    }


    // criação do método de registro para cadastro dos funcionarios presentes na clinica. Cadastro similar para:
    // Medico, paciente, dentista e secretário.
    public static void cadastrarMedico(ArrayList<Medico> medicos, Scanner scanner) throws Exceptions {
        System.out.println("----- CADASTRO DE MÉDICO -----");

        System.out.print("CPF: ");
        String cpf = scanner.next();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Telefone: ");
        String telefone = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        // Fazendo analise de dados inteiros
        if(idade <= 0 || idade >= 130){
            throw new Exceptions("Idade inválido!");
        }

        System.out.print("Identificação(CRM): ");
        int id = scanner.nextInt();

        // Fazendo analise de dados inteiros
        if(id <= 0){
            throw new Exceptions("Número inválido!");
        }

        // limpar buffer
        scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        Medico medico = new Medico(nome, cpf, telefone, idade, id, especialidade);
        medicos.add(medico);

        System.out.println("Dentista cadastrado com sucesso!\n");
    }
    public static void listarMedico(ArrayList<Medico> medicos) {
        if (medicos.isEmpty()) {
            System.out.println("Não há médicos cadastrados.");
        } else {
            System.out.println("----- MÉDICO -----");
            for (Medico medico : medicos) {
                System.out.println("Nome: " + medico.getNome());
                System.out.println("CPF: " + medico.getCpf());
                System.out.println("Idade: " + medico.getIdade());
                System.out.println("Telefone:" +medico.getTelefone());
                System.out.println("Identificação: " + medico.getId());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("-----------------------------");
            }
        }
    }
}
