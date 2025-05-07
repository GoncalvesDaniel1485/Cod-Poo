public class Circulo{
    private double raio;
    
    public Circulo(double raio){
    this.raio = raio;
}

    public double calcularArea(){
        return (double) (3.141516f * raio * raio);
    }

    public double calcularPerimetro(){
        return (double) (2 * 3.141516f * raio);
    }

    public void thetwins(){
        System.out.printf("Raio %.2f, Área %.2f, Perimetro %.2f \n", raio, calcularArea(), calcularPerimetro());
    }
}
