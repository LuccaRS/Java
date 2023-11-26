import java.util.ArrayList;
import java.util.Scanner;

public class Secretaria extends Funcionario {

    // Secretaria, id = sec

    public Secretaria(String cpf, String nome, String telefone, int idade, int id, String especialidade) {
        super(cpf, nome, telefone, idade, id, especialidade);
    }

    public static void cadastrarSecretaria(ArrayList<Secretaria> secretarias, Scanner scanner) {
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

    @Override
    public void realizarFuncao() {
        System.out.println("A secretária está marcando a consulta!");

    }
}
