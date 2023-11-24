public class Medico extends Funcionario {
    private String especialidade;

    // Construtor de médico para cada novo dentista cadastrado na clinica
    public Medico(String cpf, String nome, String telefone, int idade, int id) {
        super(cpf, nome, telefone, idade, id);
        this.especialidade = especialidade;
    }

    @Override
    public void realizarFuncao() {

    }
}
