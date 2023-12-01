import java.util.ArrayList;
import java.util.Scanner;

public class Dentista extends Funcionario{


    // Construtor de dentista para cada novo dentista cadastrado na clinica
    public Dentista(String cpf, String nome, String telefone, int idade, int id, String especialidade) {
        super(cpf, nome, telefone, idade, id, especialidade);
    }

    @Override
    public void realizarFuncao() {
        System.out.println("O dentista está em consulta nesse momento!");
    }

    public static void cadastrarDentista(ArrayList<Dentista> dentistas,Scanner scanner) throws Exceptions {
        System.out.println("----- CADASTRO DE DENTISTA -----");

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

        System.out.print("Identificação(CRO): ");
        int id = scanner.nextInt();

        // Fazendo analise de dados inteiros
        if(id <= 0){
            throw new Exceptions("Idade inválido!");
        }

        scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        Dentista dentista = new Dentista(nome, cpf, telefone, idade, id, especialidade);
        dentistas.add(dentista);

        System.out.println("Dentista cadastrado com sucesso!\n");
    }

    // Metodo responsável por fazer o listamentos de todos dentistas presentes. Segue mesma lógica pra paciente e médico
    public static void listarDentista(ArrayList<Dentista> dentistas) {
        if (dentistas.isEmpty()) {
            System.out.println("Não há dentistas cadastrados.");
        } else {
            System.out.println("----- DENTISTA -----");
            for (Dentista dentista : dentistas) {
                System.out.println("Nome: " + dentista.getNome());
                System.out.println("CPF: " + dentista.getCpf());
                System.out.println("Idade: " + dentista.getIdade());
                System.out.println("Telefone:" +dentista.getTelefone());
                System.out.println("Identificação: " + dentista.getId());
                System.out.println("Especialidade: " + dentista.getEspecialidade());
                System.out.println("-----------------------------");
            }
        }
    }



}
