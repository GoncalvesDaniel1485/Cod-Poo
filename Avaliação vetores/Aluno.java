public class Aluno{
    private String nome;
    private int matricula;
    private double nota_1;
    private double nota_2;

    public Aluno(String nome, int matricula, double nota_1, double nota_2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public double calcularMedia(){
        return (nota_1 + nota_2) / 2;
    }

    public String situacao(){
        if(calcularMedia() >= 7){
            return "Aprovado";
        } else{
            return "Reprovado";
        }
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + "\nMatricula: " + matricula + "\nNotas: " + 
        "\nNota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nMedia: " + calcularMedia() 
        + "\nSituação: " + situacao() + "\n");
    }

    public int getMatricula(){
        return matricula;
    }

}
