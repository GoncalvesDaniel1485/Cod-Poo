public class Turma{
    private Aluno[] alunos;
    private int quantidade;

    public Turma(int quantidade){
        this.quantidade = 0;
        this.alunos = new Aluno[quantidade];
    }

    public void adicionar(Aluno a){
        if(quantidade < alunos.length) 
        alunos[quantidade++] = a;
       
    }

    public void listarAlunos(){
        for(Aluno a : alunos){
            if(a != null)
            a.exibirInfo();
        }
    }

    public Aluno buscarPorMatricula(int matricula){
        for(Aluno a : alunos){
            if(a != null && a.getMatricula() == matricula){
            a.exibirInfo();
            return a;
            }
        } return null;
    }
}
