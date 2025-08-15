public class Vetor3{
    public static void main(String[] args){
        int[] vetor = new int[15];
        int[] vetor2 = new int[15];
        
    for(int i = 0; i < vetor.length; i++){
        vetor[i] = i + 1;

        vetor2[i] = vetor[i] * vetor[i];

    System.out.println("Vetor1: " + vetor[i]);
    System.out.println("Vetor2: " + vetor2[i] + "\n");
    }
}
}