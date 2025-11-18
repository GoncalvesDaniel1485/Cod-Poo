public class CartaodeCredito extends Pagamento {
    private int quantidadeParcelas;

    public CartaodeCredito(String nomeCliente, double valor, int quantidadeParcelas) {
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double processarPagamento() {
        return (getValor() + (getValor() * quantidadeParcelas * 0.02));
    }

}