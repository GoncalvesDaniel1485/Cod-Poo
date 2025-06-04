public class Helicopteromain{
    public static void main(String[] args) {
        Helicoptero h = new Helicoptero(5);
        Helicoptero e = new Helicoptero(8);

        System.out.println("Helicóptero 1: ");
        System.out.println("Está ligado? " + h.getLigado());
        System.out.println("Altitude: " + h.getAltitude());
        System.out.println("Capacidade: " + h.getCapacidade());
        System.out.println("Passageiros: " + h.getQuantidade());

        System.out.println("\nHelicóptero 2: ");
        System.out.println("Está ligado? " + e.getLigado());
        System.out.println("Altitude: " + e.getAltitude());
        System.out.println("Capacidade: " + e.getCapacidade());
        System.out.println("Passageiros: " + e.getQuantidade());
        
   

        h.ligar();
        e.ligar();

        h.decolar();
        System.out.println(h.getAltitude());
        e.decolar();
        System.out.println(e.getAltitude());
    }
    
}
