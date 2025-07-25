public class Conta{
    private int numero_conta;
    private String nome_cliente;
    private double saldo;
    private boolean ativa;

public Conta(int numero_conta, String nome_cliente){
        this.numero_conta = numero_conta;
        this.nome_cliente = nome_cliente;
    }
public void depositar(double depositar){
    if(depositar > 0 && ativa == true){
        saldo = saldo + depositar;
        }
    }
public void sacar(double sacar){
    if(sacar <= saldo && ativa == true){
        saldo = saldo - sacar;
    }
}

public void desativar(){
    if(ativa == true){
        ativa = false;
    }
}
public void ativar(){
    if(ativa == false){
        ativa = true;
    }
}

public String exibir(){
    return "\nSaldo: " + saldo + "\nNome do usuário: " + nome_cliente + "\nConta de número: " + numero_conta + "\nA conta está ativa? "  + ativa;
}

public boolean getAtiva(){
    return ativa;
}
public double getSaldo(){
    return saldo;
}
public String getNome_cliente(){
    return nome_cliente;
}
public int getNumero_conta(){
    return numero_conta;
}
public void setSaldo(double saldo){
    this.saldo = saldo;
}
public void setNumero_conta(int numero_conta){
    this.numero_conta = numero_conta;
}
public void setNome_cliente(String nome_cliente){
    this.nome_cliente = nome_cliente;
}

public void setAtiva(boolean ativa){
    this.ativa = ativa;
}

public String toString(){
    return "Numero da conta: " + numero_conta + "\n Cliente: " + nome_cliente + "\n Saldo:" + saldo + "\n Conta ativa? " + ativa;
}
}
