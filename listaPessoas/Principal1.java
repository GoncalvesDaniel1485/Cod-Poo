import java.util.Scanner;
public class Principal1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Agenda a = new Agenda(3);
        String nome;
        String telefone;
        int idade;
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome da pessoa: ");
            nome = in.nextLine();
            System.out.println("Digite o telefone da pessoa: ");
            telefone = in.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            idade = in.nextInt();
            in.nextLine();
            Pessoa p = new Pessoa(nome, telefone, idade);
            a.addPessoa(p);
        }
        System.out.println("A pessoa mais nova é: " + a.getNomeMaisNova());
        in.close();
    }
}