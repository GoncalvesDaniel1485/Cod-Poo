public class Portamain{
    public static void main(String[] args){
        Porta p = new Porta("azul", 4, 5, true);
        
        p.setAltura(40);
        p.setLargura(50);
        p.setCor("amarela");
        p.setEstaAberta(false);
        System.out.println(p);
    }
}
