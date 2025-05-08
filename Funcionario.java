public class Funcionario{
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    public Funcionario(int id, String nome, String cpf, String endereco, String telefone, int idade, double salario){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String toString(){
        return "Funcionario: " + "id: " + id + ", nome: " + nome  + ", cpf: " + cpf  + ", endereço: " + endereco +
               ", telefone: " + telefone  + ", idade: " + idade + ", salario: " + salario;
    }

    public double calculaSalarioLiquido(){
        return salario - (salario * 0.11);
    }
}
