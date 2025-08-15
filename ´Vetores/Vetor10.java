public class Vetor10{
    public static void main(String[] args){
        double[] vetor = new double[10];
        double[] vetor2 = new double[10];
        
    for (int i = 0; i < 10; i++){
        vetor[i] = i + 1; 
  
}

    for (int i = 0; i < 10; i++){
        vetor2[i] = vetor[i] / 2;

    System.out.println("vetor1: " + vetor[i]);
    System.out.println("Divisão: " + vetor2[i] + "\n");
}
    }
}
