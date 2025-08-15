public class Vetor9 {
    public static void main(String[] args){
        float[] vetor = new float[10];
        float[] vetor2 = new float[10];
        float[] vetor3 = new float[10];
        
        for (int i = 0; i < 10; i++){
        vetor[i] = i * 2;
        vetor2[i] = i + 1; 
  
}

        for (int i = 0; i < 10; i++){
        vetor3[i] = vetor[i] / vetor2[i];

        System.out.println("vetor1: " + vetor[i]);
        System.out.println("vetor2: " + vetor2[i]);
        System.out.println("Divisão dos vetores: " + vetor3[i] + "\n");


}
}
}