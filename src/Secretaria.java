public class Secretaria extends Funcionario {

    // Secretaria, id = sec

    public Secretaria(String cpf, String nome, String telefone, int idade, int id) {
        super(cpf, nome, telefone, idade, id);
    }

    @Override
    public void realizarFuncao() {
        // Funcao de marcar consulta

    }
}
