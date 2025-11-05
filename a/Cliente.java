public class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public double calcularPagamento(double dinheiro){
        return this.valorDaCompra - dinheiro;
    }
    public double getValordaCompra(){
        return this.valorDaCompra;
    }

    
}