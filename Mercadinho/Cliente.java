public class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public double calcularPagamento() {
        return this.valorDaCompra;
    }

    public double getValordaCompra() {
        return this.valorDaCompra;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Valor da compra: " + valorDaCompra;
    }
}