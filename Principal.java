public class Principal{
    public static void main(String[] args){
        Videocassete vc1 = new Videocassete("Tutorial de como respirar", 25.78);
        Videocassete vc2 = new Videocassete("Avengers complete edition", 30.16);
        Videocassete vc3 = new Videocassete("Ainda estou aqui", 15.52);
    
        Videocassete[] videocassetes = {vc1, vc2, vc3};

        for (Videocassete videocassete : videocassetes){
            System.out.println(videocassete.toString());
            System.out.printf("Valor do aluguel para 10 dias: R$%.2f%n", videocassete.getValorAluguel(10));
            System.out.println("------------------------------");
        }
    }
}
