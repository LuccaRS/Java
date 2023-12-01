import java.util.ArrayList;
import java.util.Scanner;

public class Secretaria extends Funcionario{

    // Secretaria, id = sec
    public Secretaria(String cpf, String nome, String telefone, int idade, int id, String especialidade) {
        super(cpf, nome, telefone, idade, id, especialidade);
    }

    public static void cadastrarSecretaria(ArrayList<Secretaria> secretarias, Scanner scanner) throws Exceptions {
        System.out.println("----- CADASTRO DE SECRETÁIOS -----");

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

        System.out.print("Identificação: ");
        int id = scanner.nextInt();

        // Fazendo analise de dados inteiros
        if(id <= 0){
            throw new Exceptions("Identificação inválido!");
        }


        scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        Secretaria secretaria = new Secretaria(nome, cpf, telefone, idade, id, especialidade);
        secretarias.add(secretaria);

        System.out.println("Paciente cadastrado com sucesso!\n");
    }

    public static void marcarConsulta() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("---- MARCAR CONSULTA -----");
        System.out.println("(1) Marcar consulta com médico");
        System.out.println("(2) Marcar consulta com dentista");

        // opcao = qual profissional da consulta
        int opcao = scanner.nextInt();

        System.out.println("Qual data deseja marcar a consulta");
        String data = scanner.next();

        System.out.println("Qual horário");
        String horario = scanner.next();

        System.out.println("Agradecemos seu contato. Consulta agendada com sucesso!\n");

        calcularConsulta(opcao,data,horario);
    }

    @Override
    public void realizarFuncao() {
        System.out.println("A secretária está trabalhando agora. Aguarde um momento!");

    }

    public static double calcularConsulta(int opcao, String data, String horario) {

        return 250;
    }
}
