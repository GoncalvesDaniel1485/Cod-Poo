public class Calendariomain{
    public static void main(String[] args){
        Calendario c = new Calendario(15, 07, 2000);
        Calendario g = new Calendario(07, 02, 2025);
    

    c.mostrarData();
    c.anoBissexto();
    g.mostrarData();
    g.anoBissexto();
    }
}