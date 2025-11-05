public class Main {
    public static void main(String[] args) {
        Mercadinho mercadinho = new Mercadinho();

        Cliente c1 = new Clienteregular("João", 100.0);
        Cliente c2 = new ClienteVip("Maria", 200.0, "1234-5678-9012");
        Cliente c3 = new ClienteOuroVip("Carlos", "Rua das Graças, 10", 300.0, "9876-5432-1098");

        mercadinho.adicionarCliente(c1);
        mercadinho.adicionarCliente(c2);
        mercadinho.adicionarCliente(c3);

        mercadinho.imprimirClientes();
        System.out.println("Total geral de vendas: R$" + mercadinho.calcularTotal());
    }
}