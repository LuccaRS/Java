import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {

    // Criando classe de Paciente para cadastrado de pacientes
    private String nome;
    private String cpf;
    private String email;
    private int idade;

    public Paciente(String nome, String cpf, String email, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void cadastrarPaciente(ArrayList<Paciente> pacientes,Scanner scanner) {
        System.out.println("Cadastro de Dentista:");

        System.out.print("CPF: ");
        String cpf = scanner.next();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Telefone: ");
        String telefone = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        Paciente paciente = new Paciente(nome, cpf, telefone, idade);
        pacientes.add(paciente);

        System.out.println("Paciente cadastrado com sucesso!\n");
    }


    public static void listarPacientes(ArrayList<Paciente> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("Não há dentistas cadastrados.");
        } else {
            System.out.println("----- PACIENTE -----");
            for ( Paciente paciente : pacientes) {
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("CPF: " + paciente.getCpf());
                System.out.println("Idade: " + paciente.getIdade());
                System.out.println("E-mail : " + paciente.getEmail());
                System.out.println("-----------------------------");
            }
        }
    }
}
