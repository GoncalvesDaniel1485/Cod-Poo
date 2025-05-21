//1) Defina uma classe chamada Professor com os atributos: matrícula, nome do professor e nome do departamento. 
//Inclua na classe um construtor, os métodos gets e sets e um método para imprimir o conteúdo dos atributos.
//Crie uma classe principal para criar objetos e invocar (chamar) os métodos disponíveis na classe Professor.

public class Professor{
    private int matricula;
    private String nomedoProfessor;
    private String nomedoDepartamento;

    public Professor(int matricula, String nomedoProfessor, String nomedoDepartamento){
        this.matricula = matricula;
        this.nomedoProfessor = nomedoProfessor;
        this.nomedoDepartamento = nomedoDepartamento;
    }

    public int getMatricula(){
        return matricula;
    }
    public String getProfessor(){
        return nomedoProfessor;
    }
    public String getDepartamento(){
        return nomedoDepartamento;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setProfessor(String nomedoProfessor){
        this.nomedoProfessor = nomedoProfessor;
    }
    public void setDepartamento(String nomedoDepartamento){
        this.nomedoDepartamento = nomedoDepartamento;
    }

    public void imprimir(){
        System.out.println("Professor: " + nomedoProfessor + "\nMatrícula: " + matricula + "\nDepartamento: " + nomedoDepartamento);
    }
}