public class ContaMain{
public static void main(String args[]){
    
    Conta c1 = new Conta(1, "Roberto");
    Conta c2 = new Conta(2, "Neto");
    Conta c3 = new Conta(3, "Ronerto");
    
    System.out.println("Exibir estado das contas 1: \n");
    System.out.println(c1+ "\n");
    System.out.println(c2+ "\n");
    System.out.println(c3+ "\n");

    c1.ativar(); c2.ativar(); c3.ativar();

    c1.depositar(500); c2.depositar(600);  c3.depositar(8800);

    System.out.println("\nExibir estado das contas 2: \n");
    System.out.println(c1+ "\n");
    System.out.println(c2+ "\n");
    System.out.println(c3+ "\n");

    c1.setNome_cliente("Antônio");
    c2.setNome_cliente("Beto");
    c3.setNome_cliente("Iara");

    System.out.println("\nExibir estado das contas 3: \n");
    System.out.println(c1.exibir()+ "\n" + c2.exibir()+ "\n" + c3.exibir());

    c1.sacar(100);
    c2.sacar(450);
    c3.sacar(7211);

    System.out.println("\nExibir dados 4: \n");
    System.out.println(c1.exibir()+ "\n" + c2.exibir()+ "\n" + c3.exibir());

    c3.desativar();   c1.desativar();

    System.out.println("\nExibir os dados 5: \n");
    System.out.println(c1.exibir()+ "\n" + c2.exibir()+ "\n" + c3.exibir());

    }
}
