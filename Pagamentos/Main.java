public class Main {
    public static void main(String[] args) {
        CadastroPagamento cadastro = new CadastroPagamento(7);

        Pagamento p1 = new Pix("André", 750.0, "150.120.263-99");
        Pagamento p2 = new Boleto("Henrique", 200.0, "001 9 0500 9 5 4014481606 9 0680935031 4 3 3737 0000000100");
        Pagamento p3 = new CartaodeCredito("Murilo", 200.0, 3);
        Pagamento p4 = new Pix("Pastel", 700.0, "400.289.220-00");
        Pagamento p5 = new CartaodeCredito("Nandinho", 5600.0, 8);

        cadastro.adicionarPagamento(p1);
        cadastro.adicionarPagamento(p2);
        cadastro.adicionarPagamento(p3);
        cadastro.adicionarPagamento(p4);
        cadastro.adicionarPagamento(p5);

        cadastro.imprimirPagamentos();
        System.out.println("Total geral de vendas: R$" + cadastro.calcularTotal());
    }

}
