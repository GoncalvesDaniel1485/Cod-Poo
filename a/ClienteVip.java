public class ClienteVip extends Cliente{
    private String NumeroCartao;

    public ClienteVip(String nome, Double valorDaCompra, String NumeroCartao){
        super(nome, valorDaCompra);
        this.NumeroCartao = NumeroCartao;
    }
    public double calcularPagamento(double dinheiro){
        double desconto = getValordaCompra() * 0.10;
        return (getValordaCompra() - desconto) - dinheiro;
    }


}