public class Videocassetemain{
    public static void main(String[] args){
        Videocassete vc1 = new Videocassete("Tutorial de como respirar", 25.78);
        Videocassete vc2 = new Videocassete("Avengers complete edition", 30.16);
        Videocassete vc3 = new Videocassete("Ainda estou aqui", 15.52);
    
        System.out.println("Videocassetes: ");
        System.out.println(vc1);
        System.out.println(vc2);
        System.out.println(vc3);

        System.out.println("Aluguel em R$: ");
        System.out.println(vc1.getTitulo() + ": aluguel: " + vc1.getValorAluguel(2));
        System.out.println(vc2.getTitulo() + ": aluguel: " + vc2.getValorAluguel(2));
        System.out.println(vc3.getTitulo() + ": aluguel: " + vc3.getValorAluguel(2));
    }
}
