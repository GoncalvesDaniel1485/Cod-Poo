public class ClienteOuroVip extends ClienteVip {
    private String endereco;

    public ClienteOuroVip(String nome, String endereco, Double valorDaCompra, String NumeroCartao) {
        super(nome, valorDaCompra, NumeroCartao);
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        return getValordaCompra() * 0.85;

    }

}