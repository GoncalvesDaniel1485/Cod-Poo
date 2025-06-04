public class Helicopteromain{
    public static void main(String[] args){
        Helicoptero h = new Helicoptero(5);
        Helicoptero e = new Helicoptero(8);

        System.out.println("Exibir o estado dos helicópteros 1 \n");
        System.out.println(h + "\n");
        System.out.println(e + "\n");
        
        System.out.println("\nExibir o estado dos helicópteros 2 \n");
        h.entra(); h.entra(); h.entra();
        h.ligar();
        h.decolar(20);
        System.out.println(h);
        
        e.entra();  e.entra(); e.entra(); e.entra(); e.entra(); 
        e.ligar();
        e.decolar(30);
        System.out.println(e);

        System.out.println("\nExibir o estado dos helicópteros 3 \n");
        h.aterrissar();
        e.aterrissar();
        h.desligar();
        e.desligar();
        h.sair(); h.sair();
        e.sair(); e.sair(); e.sair();
        System.out.println(h);
        System.out.println(e);

    }
    
}
