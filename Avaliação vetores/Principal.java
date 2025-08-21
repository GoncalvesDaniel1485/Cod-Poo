public class Principal {
    public static void main(String[] args){
        Aluno a = new Aluno("Robson", 1, 9.0, 7.0);
        Aluno b = new Aluno("Pedro", 2, 7.0, 3.0);
        Aluno c = new Aluno("Antônio", 3, 4.0, 6.0);
        Turma turma = new Turma(5);

        //adicionar alunos no vetor
        turma.adicionar(a); turma.adicionar(b); turma.adicionar(c);

        System.out.println("Listar todos os alunos: \n");
        turma.listarAlunos();
    
        System.out.println("Buscar por matrícula: \n");
        turma.buscarPorMatricula(2);
    }

}
