public class Vetor11{
    public static  void main(String[] args){
        int[] vetor = new int[10];
        int contador = 0;
        
    for(int i = 0; i < 10; i++){
        vetor[i] = i + 1;
            
        if(vetor[i] % 2 == 0){
            contador ++;
    System.out.println("vetor: " + vetor[i]);
    System.out.println("Quantidade de pares: " + contador);
        }
        }
    }
}