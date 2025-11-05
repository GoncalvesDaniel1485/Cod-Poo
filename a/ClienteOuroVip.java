public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, String endereco, Double valorDaCompra, String NumeroCartao){
        super(nome, valorDaCompra, NumeroCartao);
        this.endereco = endereco;
    }
    public double calcularPagamento(double dinheiro){
        double desconto = getValordaCompra() * 0.15;
        return (getValordaCompra() - desconto) - dinheiro;
    }
    
}