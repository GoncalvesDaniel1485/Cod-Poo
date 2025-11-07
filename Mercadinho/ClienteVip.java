public class ClienteVip extends Cliente {
    private String NumeroCartao;

    public ClienteVip(String nome, Double valorDaCompra, String NumeroCartao) {
        super(nome, valorDaCompra);
        this.NumeroCartao = NumeroCartao;
    }

    public double calcularPagamento() {
        return getValordaCompra() * 0.9;
    }

}