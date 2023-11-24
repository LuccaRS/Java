public abstract class Funcionario {

    // Variaveis para representarem os dados dos funcionarios presentes na Clinica
    private String cpf;
    private String nome;
    private String telefone;
    private int idade;

    // id = CRM, CRO de médicos e dentistas
    private int id;

    // Construtor de novo funcionario
    public Funcionario(String cpf, String nome, String telefone, int idade, int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.id = id;
    }

    public abstract void realizarFuncao();
}
