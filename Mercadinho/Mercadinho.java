public class Mercadinho {
    private Cliente[] clientes;
    private int qntd;

    public Mercadinho(int capacidade) {
        this.clientes = new Cliente[capacidade];
        this.qntd = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (qntd < clientes.length) {
            clientes[qntd] = cliente;
            qntd++;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < qntd; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes() {
        for (int i = 0; i < qntd; i++) {
            System.out.println(
                    "Cliente: " + clientes[i].getNome() + "Valor da compra: " + clientes[i].calcularPagamento());
        }
    }
}
