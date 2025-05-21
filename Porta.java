//2) Defina uma classe Porta com os atributos: cor, altura, largura e estaAberta. Inclua na classe um construtor 
//os métodos gets e sets e o método toString() para retornar a representação textual do objeto.
//Crie uma classe principal para criar objetos e invocar (chamar) os métodos disponíveis na classe Porta.

public class Porta{
    private String cor;
    private int altura;
    private int largura;
    private boolean estaAberta;

    public Porta(String cor, int altura, int largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor(){
        return cor;
    }
    public int getaltura(){
        return altura;
    }
    public int getLargura(){
        return largura;
    }
    public boolean getEstaAberta(){
        return estaAberta;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setLargura(int largura){
        this.largura = largura;
    }
    public void setEstaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }
    public String toString(){
        return "A porta " + cor + " tem " + altura + " de altura e " + largura + " de largura" + "\nA porta está aberta? " + estaAberta;
    }
}