public class TelevisorMain{
public static void main(String args[]){
    Televisor te = new Televisor(10, 90);
    ControleRemoto t = new ControleRemoto(te);    
    
    System.out.println(t+ "\n");
    t.ligar();
    t.aumentarVolume(9); t.aumentarVolume(2);
    t.trocarCanal(12);
    System.out.println(t+ "\n");

    t.diminuirVolume(500);
    t.desligar();
    System.out.println(t);
    }
}