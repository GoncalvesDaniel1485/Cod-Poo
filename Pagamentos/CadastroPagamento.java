public class CadastroPagamento {
    private Pagamento[] pagamentos;
    private int qntd;

    public CadastroPagamento(int capacidade) {
        this.pagamentos = new Pagamento[capacidade];
        this.qntd = 0;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        if (qntd < pagamentos.length) {
            pagamentos[qntd] = pagamento;
            qntd++;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < qntd; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }

    public void imprimirPagamentos() {
        for (int i = 0; i < qntd; i++) {
            System.out.println(
                    "Pagamento: " + pagamentos[i].getnomeCliente() + "\n" + "Valor da compra: "
                            + pagamentos[i].processarPagamento() + "\n");
        }
    }

}
