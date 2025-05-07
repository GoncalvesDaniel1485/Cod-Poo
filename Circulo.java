public class Circulo{
    private int raio;
    
    public Circulo(int raio){
    this.raio = raio;
}

    public int calcularArea(){
        return (int) (3.141516 * raio * raio);
    }

    public int calcularPerimetro(){
        return (int) (2 * 3.141516 * raio);
    }

    public void thetwins(){
        System.out.printf("Raio %d, Área %d, Perimetro %d \n", raio, calcularArea(), calcularPerimetro());
    }
}