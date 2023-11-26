public class Secretaria extends Funcionario {

    // Secretaria, id = sec

    public Secretaria(String cpf, String nome, String telefone, int idade, int id, String especialidade) {
        super(cpf, nome, telefone, idade, id, especialidade);
    }

    @Override
    public void realizarFuncao() {
        System.out.println("A secretária está marcando a consulta!");

    }
}
