public class Vetor12{
    public static  void main(String[] args){
        int[] vetor = new int[10];
        int soma = 0;

    for(int i = 0; i < 10; i++){
        vetor[i] = i + 1;
        soma = vetor[i] + soma;
        }
        
    System.out.println("Soma de todos os elementos: " + soma);
    }
}