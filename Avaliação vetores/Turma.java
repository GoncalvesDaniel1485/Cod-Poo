public class Turma{
    private Aluno[] alunos;
    private int quantidade;

    public Turma(int quantidade){
        this.quantidade = 0;
        this.alunos = new Aluno[quantidade];
    }

    public boolean adicionar(Aluno a){
        if(quantidade == this.alunos.length) return false;
        this.alunos[this.quantidade++] = a;
        return true;
    }

    public void listarAlunos(){
        for(Aluno a : this.alunos){
            a.exibirInfo();
        }
    }

    public Aluno buscarPorMatricula(int matricula){
        for(Aluno a : this.alunos){
            if(a.getMatricula() == matricula){
                return a;
            }
        } return null;
    }
}