public class Vetor{
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetor2 = new int[5];
        
    for(int i = 0; i < vetor.length; i++){
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        vetor2[i] = vetor[i];

    System.out.println("Vetor1: " + vetor[i]);
    System.out.println("Vetor2: " + vetor2[i] + "\n");
    }
}
}