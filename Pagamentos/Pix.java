public class Pix extends Pagamento {
    private String chave;

    public Pix(String nomeCliente, double valor, String chave) {
        super(nomeCliente, valor);
        this.chave = chave;
    }

    public double processarPagamento() {
        return getValor();
    }
}