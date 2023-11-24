public class Dentista extends Funcionario{

    // Adicionando uma especialidade para o médico/dentista presente no consultório
    private String especialidade;

    // Construtor de dentista para cada novo dentista cadastrado na clinica
    public Dentista(String cpf, String nome, String telefone, int idade, int id) {
        super(cpf, nome, telefone, idade, id);
        this.especialidade = especialidade;
    }

    @Override
    public void realizarFuncao() {
        System.out.println("O dentista ");
    }
}
