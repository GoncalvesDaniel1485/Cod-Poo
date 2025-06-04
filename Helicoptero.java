public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int quantidade;

    public Helicoptero(int capacidade){
        this.capacidade = capacidade;
    }

public void entra(){
    if(capacidade < 20){
        this.quantidade = quantidade + 1;
    }
}

public void sair(){
    if(capacidade == 1){
        this.quantidade = quantidade - 1;
    }
}

public void ligar(){
    if(ligado == false){
        ligado = true;
    }
}
public void decolar(){
    if(ligado == true && altitude == 0){
        setAltitude(10);
}
}
public void aterrissar(){
    if(ligado == true && altitude > 0){
        altitude = 0;
    }
}

public void desligar(){
    if(ligado == true && altitude ==0){
        ligado = false;
    }
}

public boolean getLigado(){
    return ligado;
}
public int getAltitude(){
    return altitude;
}
public int getCapacidade(){
    return capacidade;
}
public int getQuantidade(){
    return quantidade;
}

public void setAltitude(int altitude){
    this.altitude = altitude;
}
public void setLigado(boolean ligado){
    this.ligado = ligado;
}
public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}
public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
}

public String toString(){
    return "O helicótero está: " + ligado + "voando na altura: " + altitude + "com " + 
    quantidade + "passageiros, obedecendo a capacidade de " + capacidade + "pessoas." ;
}
}
