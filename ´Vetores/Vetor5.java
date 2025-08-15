public class Vetor5{
    public static void main(String[] args){
    int[] vetor = new int[10];
    int[] vetor2 = new int[10];
        
    for(int i = 0; i < vetor.length; i++){
        vetor[i] = i + 1;

        vetor2[i] = vetor[i] * i;

    System.out.println("Vetor1: " + vetor[i]);
    System.out.println("Vetor2: " + vetor2[i] + "\n");
    }
}
}
