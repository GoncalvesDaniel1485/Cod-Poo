public class ControleRemoto{
    public Televisor televisor;

public ControleRemoto(Televisor televisor){
    this.televisor = televisor;
    }

    public void ligar(){
    televisor.ligar();
    }

public void desligar(){
    televisor.desligar();
    }

public void aumentarVolume(int aumentarVolume){
    televisor.aumentarVolume(aumentarVolume);
    }

public void diminuirVolume(int diminuirVolume){
    televisor.diminuirVolume(diminuirVolume);
    }

public void trocarCanal(int trocarCanal){
    televisor.trocarCanal(trocarCanal);
    }

public String toString(){
    return televisor.toString();
    }
}