public abstract class Funcionario {

    // Variaveis para representarem os dados dos funcionarios presentes na Clinica
    private String cpf;
    private String nome;
    private String telefone;
    private int idade;

    // id = CRM, CRO de médicos e dentistas
    private int id;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
