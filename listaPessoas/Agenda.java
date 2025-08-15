public class Agenda{
private Pessoa[] pessoas;
private int qtde;

public Agenda(int qtde) {
    this.pessoas = new Pessoa[qtde];
    this.qtde = 0;
    
}
public boolean addPessoa(Pessoa p) {
    if (qtde == pessoas.length) return false;
        pessoas[qtde++] = p;
        return true;
}
public String getNomeMaisNova(){
    if(qtde == 0) return null;
    Pessoa menor = pessoas[0];
    for(Pessoa p: pessoas){
        if(p.getIdade() < menor.idade){
        menor = p;}
    }
    return menor.getNome();
}
}