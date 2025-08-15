public class Vetor6{
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        
        for (int i = 0; i < 10; i++){
        vetor[i] = i + 1;
        vetor2[i] = i + 1; 
  
}

        for (int i = 0; i < 10; i++){
        vetor3[i] = vetor[i] + vetor2[i];

        System.out.println("vetor1: " + vetor[i]);
        System.out.println("vetor2: " + vetor2[i]);
        System.out.println("Soma dos vetores: " + vetor3[i] + "\n");
}
}
}