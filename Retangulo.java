public class Retangulo{ 
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }

    public void skeletronalpha(){
        System.out.printf("Largura %d, Comprimento %d, Área %d, Perimetro %d \n", largura, + comprimento, calcularArea(), calcularPerimetro());
    }
    
}
