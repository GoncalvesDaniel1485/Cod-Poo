import java.util.ArrayList;

public class Mercadinho {
    private ArrayList<Cliente> clientes;

    public Mercadinho(){
        clientes = new ArrayList<>();
    }

     public void adicionarCliente(Cliente c){
        clientes.add(c);
    }


    public double calcularTotal() {
        double total = 0;
        for (Cliente p : clientes) {
            total += p.getValordaCompra();
        }
        return total;}

    public void imprimirClientes(){
        for (Cliente c : clientes){
            System.out.println(c);
            System.out.println("-----------");
        }
}
}
