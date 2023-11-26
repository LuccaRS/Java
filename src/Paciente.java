import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {

    // Criando classe de Paciente para cadastrado de pacientes
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private String telefone;

    public Paciente(String nome, String cpf, String email, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }


    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public static void cadastrarPaciente(ArrayList<Paciente> pacientes, Scanner scanner) {
        System.out.println("----- CADASTRO DE PACIENTE -----");

        System.out.print("CPF: ");
        String cpf = scanner.next();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Telefone: ");
        String telefone = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.next();

        Paciente paciente = new Paciente(nome, cpf, email, idade, telefone);
        pacientes.add(paciente);

        System.out.println("Paciente cadastrado com sucesso!\n");
    }
    public static void listarPacientes(ArrayList<Paciente> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("Não há pacientes cadastrados.");
        } else {
            System.out.println("----- PACIENTE -----");
            for ( Paciente paciente : pacientes) {
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("CPF: " + paciente.getCpf());
                System.out.println("Idade: " + paciente.getIdade());
                System.out.println("E-mail : " + paciente.getEmail());
                System.out.println("Telefone : " + paciente.getTelefone());
                System.out.println("-----------------------------");
            }
        }
    }
}
