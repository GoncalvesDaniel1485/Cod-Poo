public class Vetor4{
    public static void main(String[] args){
        double[] vetor = new double[15];
        double[] vetor2 = new double[15];
        
    for (int i = 0; i < 10; i++){
        vetor[i] = i + 1; 
}

    for (int i = 0; i < 10; i++){
        vetor2[i] = Math.sqrt(vetor[i]);

    System.out.println("vetor1: " + vetor[i]);
    System.out.println("Vetor2: " + vetor2[i] + "\n");
}
    }
}