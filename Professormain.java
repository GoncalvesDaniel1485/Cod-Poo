public class Professormain{
    public static void main(String[] args){
        Professor p = new Professor(2020130021, "Barros", "Programação");
        System.out.println("Melhor Professor: ");
        p.imprimir();
        
        
        System.out.println("\nNovo Professor: ");
        p.setDepartamento("Educação Física");
        p.setMatricula(2020130022);
        p.setProfessor("Jedson");
        p.imprimir();
    }
}