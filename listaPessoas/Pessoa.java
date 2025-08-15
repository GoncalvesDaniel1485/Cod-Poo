public class Pessoa{
    private String nome;
    private String telefone;
    int idade;

public Pessoa(String nome, String telefone, int idade) {
    this.nome = nome;
    this.telefone = telefone;
    this.idade = idade;
    }

public String getNome() {
        return nome;
    }
public String getTelefone() {
        return telefone;
    }
public int getIdade() {
        return idade;
}
public void setNome(String nome) {
        this.nome = nome;
    }
public void setTelefone(String telefone) {
        this.telefone = telefone;
}
public void setIdade(int idade) {
        this.idade = idade;
    }

public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}