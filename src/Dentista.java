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

    public static void cadastrarDentista(ArrayList<Dentista> dentistas,Scanner scanner) {
        System.out.println("Cadastro de Dentista:");

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

        Dentista dentista = new Dentista(nome, cpf, telefone, idade, id, especialidade);
        dentista.setEspecialidade(especialidade);

        System.out.println("Dentista cadastrado com sucesso!\n");
    }

    public static void listarDentista(ArrayList<Dentista> dentistas) {
        if (dentistas.isEmpty()) {
            System.out.println("Não há dentistas cadastrados.");
        } else {
            System.out.println("----- DENTISTA -----");
            for (Dentista dentista : dentistas) {
                System.out.println("Nome: " + dentista.getNome());
                System.out.println("CPF: " + dentista.getCpf());
                System.out.println("Idade: " + dentista.getIdade());
                System.out.println("Identificação: " + dentista.getId());
                System.out.println("Especialidade: " + dentista.getEspecialidade());
                System.out.println("-----------------------------");
            }
        }
    }



}
