import java.util.ArrayList;

public class Dentista extends Funcionario{

    // Adicionando uma especialidade para o médico/dentista presente no consultório
    private String especialidade;

    // Construtor de dentista para cada novo dentista cadastrado na clinica
    public Dentista(String cpf, String nome, String telefone, int idade, int id) {
        super(cpf, nome, telefone, idade, id);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void realizarFuncao() {
        System.out.println("O dentista ");
    }

    private static void listarDentistas(ArrayList<Dentista> dentistas) {
        if (dentistas.isEmpty()) {
            System.out.println("Não há dentistas cadastrados.");
        } else {
            System.out.println("Lista de Dentistas:");
            for (Dentista dentista : dentistas) {
                System.out.println("Nome: " + dentista.getNome());
                System.out.println("CPF: " + dentista.getCpf());
                System.out.println("Idade: " + dentista.getIdade());
                System.out.println("" + dentista.getId());
                System.out.println("Especialidade: " + dentista.getEspecialidade());
                System.out.println("-----------------------------");
            }
        }
    }

}
