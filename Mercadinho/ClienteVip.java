public class ClienteVip extends Cliente{
    private String NumeroCartao;

    public ClienteVip(String nome, Double valorDaCompra, String NumeroCartao){
        super(nome, valorDaCompra);
        this.NumeroCartao = NumeroCartao;
    }
    public double calcularPagamento(double dinheiro){
        return dinheiro = getValordaCompra() * 0.9;
    }


}