public class Televisor{
    private int canal;
    private int volume;
    private boolean ligado;

public Televisor(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }
public void ligar(){
    if(ligado == false){
        ligado = true;
    }
}

public void desligar(){
    if(ligado == true){
        ligado = false;
    }
}

public void aumentarVolume(int aumentarVolume){
    if(volume >= 0 && ligado == true){
        volume = volume + aumentarVolume;
        if(volume > 100){
            volume = 100;
        }
    }
}

public void diminuirVolume(int diminuirVolume){
    if(volume >= 0 && ligado == true){
        volume = volume - diminuirVolume;
        if(volume < 0){
            volume = 0;
        }
    }
}

public void trocarCanal(int trocarCanal){
    if(canal >= 0 && ligado == true){
        canal = trocarCanal;
    }
}

public String toString(){
    return "Ligado?\n" + ligado + "\nVolume: " + volume + "\nCanal: " + canal;
    }
}