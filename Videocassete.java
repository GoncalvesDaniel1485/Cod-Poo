public class Videocassete{
    private String titulo;
    private double aluguel;

    public Videocassete(String titulo, double aluguel){
        this.titulo = titulo;
        this.aluguel = aluguel;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public double getAluguel(){
        return aluguel;
    }
    public double getValorAluguel(int numeroDeDiasAlugada){
        return aluguel * numeroDeDiasAlugada;
    }

    public String toString(){
        return "Título: " + titulo + ", Preço por dia: R$" + aluguel;
    }
    
    }